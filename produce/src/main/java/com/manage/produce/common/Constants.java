package com.manage.produce.common;


import net.sf.json.JSON;
import net.sf.json.JSONObject;

import java.util.HashMap;

public class Constants {
    public static JSONObject FALSE;
    public static JSONObject SUCCESS;

    static {
        FALSE = new JSONObject();
        FALSE.put("status", -1);
        SUCCESS = new JSONObject();
        SUCCESS.put("status", 1);
    }
}
