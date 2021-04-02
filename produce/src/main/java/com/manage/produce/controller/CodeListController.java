package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.CodeList;
import com.manage.produce.service.CodeListService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codelist")
public class CodeListController {
    @Autowired
    private CodeListService codeListService;

    @GetMapping("/get")
    public List<CodeList> getInfo(@RequestParam String codename){
        codename = "%" + codename + "%";
        return codeListService.getInfo(codename);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody CodeList codeList){
        codeListService.saveData(codeList);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        codeListService.deleteData(id);
        return Constants.SUCCESS;
    }
}
