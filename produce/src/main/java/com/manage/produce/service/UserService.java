package com.manage.produce.service;

import com.manage.produce.common.Constants;
import com.manage.produce.dao.LoginLogDao;
import com.manage.produce.dao.UserDao;
import com.manage.produce.data.LoginLog;
import com.manage.produce.data.NewUser;
import com.manage.produce.data.User;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;

    public JSONObject login(User user) {
        User checkUser = userDao.findByUserName(user.getUserName());
        if(checkUser == null) {
            return Constants.FALSE;
        }else {
            if(!user.getPassword().equals(checkUser.getPassword())) {
                return Constants.FALSE;
            }else {
                LoginLog loginLog = new LoginLog();
                loginLog.setLoginName(user.getLoginName());
                loginLog.setLoginIP(user.getLoginIP());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                long lt = System.currentTimeMillis();//将时间戳转换为时间
                Date date = new Date(lt);//将时间调整为yyyy-MM-dd HH:mm:ss时间样式
                String res = simpleDateFormat.format(date);
                loginLog.setLoginTime(res);
                loginLog.setLoginMachineName(user.getLoginMachineName());
                loginLog.setUserName(user.getUserName());
                loginLogDao.save(loginLog);
                return Constants.SUCCESS;
            }
        }
    }

    public JSONObject save(NewUser newUser) {
        User user = new User();
        user.setUserName(newUser.getUserName());
        user.setPassword(newUser.getPassword());
        User checkUser = userDao.findByUserName(user.getUserName());
        if(checkUser == null) {
            return Constants.FALSE;
        }else {
            if(!checkUser.getPassword().equals(newUser.getPassword())) {
                return Constants.FALSE;
            }else {
                user.setPassword(newUser.getNewPassword());
                userDao.save(user);
                return Constants.SUCCESS;
            }
        }
    }
}
