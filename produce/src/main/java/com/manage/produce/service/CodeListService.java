package com.manage.produce.service;

import com.manage.produce.dao.CodeListDao;
import com.manage.produce.data.CodeList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeListService {
    @Autowired
    private CodeListDao codeListDao;

    public List<CodeList> getInfo(String codeName){
        if(codeName.equals("%%")) {
            return codeListDao.findAll();
        }
        return codeListDao.findByCodeNameLike(codeName);
    }

    public void saveData(CodeList codeList){
        codeListDao.save(codeList);
    }

    public void deleteData(Long id){
        codeListDao.deleteById(id);
    }
}
