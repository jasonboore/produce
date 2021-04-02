package com.manage.produce.service;

import com.manage.produce.dao.ActiveUserDao;
import com.manage.produce.data.ActiveUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ActiveUserService {
    @Autowired
    private ActiveUserDao activeUserDao;

    public List<ActiveUser> getInfo(){
        ActiveUser activeUser = new ActiveUser();
        activeUser.setPid(1L);
        activeUser.setActiveName("管理员");
        activeUser.setUnitName("建设公司");
        activeUser.setUserName("admin");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = System.currentTimeMillis();//将时间戳转换为时间
        Date date = new Date(lt);//将时间调整为yyyy-MM-dd HH:mm:ss时间样式
        String res = simpleDateFormat.format(date);
        activeUser.setActiveTime(res);
        activeUserDao.save(activeUser);
        return activeUserDao.findAll();
    }
}
