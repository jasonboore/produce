package com.manage.produce.service;

import com.manage.produce.dao.PeopleManagementDao;
import com.manage.produce.data.DepartmentManagement;
import com.manage.produce.data.PeopleManagement;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PeopleManagementService {
    @Autowired
    private PeopleManagementDao peopleManagementDao;

    public JSONObject getInfo(){
        List<PeopleManagement> peopleManagementList = peopleManagementDao.findAll();
        Map<String, List<PeopleManagement>> map = new HashMap<>();
        for (PeopleManagement peopleManagement : peopleManagementList) {
            String affiliatedUnits = peopleManagement.getAffiliatedUnits();
            if(!map.containsKey(affiliatedUnits)) {
                List<PeopleManagement> list = new ArrayList<>();
                list.add(peopleManagement);
                map.put(affiliatedUnits, list);
            }else {
                List<PeopleManagement> list = map.get(affiliatedUnits);
                list.add(peopleManagement);
                map.put(affiliatedUnits, list);
            }
        }
        JSONArray jsonArray = new JSONArray();
        for (String s : map.keySet()) {
            JSONObject j = new JSONObject();
            j.put(s, map.get(s));
            jsonArray.add(j);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    public List<PeopleManagement> getByUnits(String units) {
        return peopleManagementDao.findByAffiliatedUnits(units);
    }

    public void saveData(PeopleManagement peopleManagement){
        peopleManagementDao.save(peopleManagement);
    }

    public void deleteData(Long id){
        peopleManagementDao.deleteById(id);
    }
}
