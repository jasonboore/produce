package com.manage.produce.controller;

import com.manage.produce.common.Constants;
import com.manage.produce.data.PeopleManagement;
import com.manage.produce.service.PeopleManagementService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleManagementController {
    @Autowired
    private PeopleManagementService peopleManagementService;

    @GetMapping("/get")
    public JSONObject getInfo(){
        return peopleManagementService.getInfo();
    }

    @GetMapping("/getone/{units}")
    public List<PeopleManagement> getByUnits(@PathVariable String units) {
        return peopleManagementService.getByUnits(units);
    }

    @PostMapping("/save")
    public JSONObject saveData(@RequestBody PeopleManagement peopleManagement){
        peopleManagementService.saveData(peopleManagement);
        return Constants.SUCCESS;
    }

    @GetMapping("/delete/{id}")
    public JSONObject deleteData(@PathVariable Long id){
        peopleManagementService.deleteData(id);
        return Constants.SUCCESS;
    }
}
