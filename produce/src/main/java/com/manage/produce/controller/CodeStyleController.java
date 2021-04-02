package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.CodeStyle;
import com.manage.produce.service.CodeStyleService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codestyle")
public class CodeStyleController {
    @Autowired
    private CodeStyleService codeStyleService;

    @GetMapping("/get")
    public List<CodeStyle> getInfo(@RequestParam("codestyle") String codeStyle){
        return codeStyleService.getInfo(codeStyle);
    }


    @PostMapping("/save")
    public JSONObject saveData(@RequestBody CodeStyle codeStyle){
        codeStyleService.saveData(codeStyle);
        return Constants.SUCCESS;
    }
}
