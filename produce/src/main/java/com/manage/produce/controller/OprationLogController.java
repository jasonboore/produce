package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.dao.OprationLogDao;
import com.manage.produce.data.OprationLog;
import com.manage.produce.service.OprationLogService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/oprationlog")
public class OprationLogController {
    @Autowired
    private OprationLogService oprationLogService;

    @Autowired
    private OprationLogDao oprationLogDao;

    @PostMapping("/save")
    public JSONObject save(@RequestBody OprationLog oprationLog){
        oprationLogDao.save(oprationLog);
        return Constants.SUCCESS;
    }

    @GetMapping("/get")
    public List<OprationLog> getInfo(){
        return oprationLogService.getInfo();
    }
}
