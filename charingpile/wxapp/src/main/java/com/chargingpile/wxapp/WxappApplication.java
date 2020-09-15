package com.chargingpile.wxapp;

import com.chargingpile.wxapp.constant.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileInputStream;
import java.util.Map;

@SpringBootApplication
public class WxappApplication {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/opt/save_files/全国各地区身份证代码大全");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            int size = 3512;
            for (int i = 1; i < size; i++) {
                Row row = sheet.getRow(i);
                String key = (int)row.getCell(0).getNumericCellValue() + "";
                String val = row.getCell(1).getStringCellValue() + "";
                Constants.CODE_AREA.put(key, val);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//        for (Map.Entry<String, String> stringStringEntry : Constants.CODE_AREA.entrySet()) {
//            System.out.println(stringStringEntry.getKey() + "  " + stringStringEntry.getValue());
//        }
        SpringApplication.run(WxappApplication.class, args);
    }

}
