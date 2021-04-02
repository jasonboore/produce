package com.manage.produce.service;

import com.manage.produce.dao.CodeStyleDao;
import com.manage.produce.data.CodeStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeStyleService {
    @Autowired
    private CodeStyleDao codeStyleDao;

    public List<CodeStyle> getInfo(String codeName){
        return codeStyleDao.findByCodeName(codeName);
    }

    public void saveData(CodeStyle codeStyle){
        codeStyleDao.save(codeStyle);
    }
}
