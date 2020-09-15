package com.chargingpile.subscribe.subscribeservice;


import com.chargingpile.subscribe.common.Contants;
import com.chargingpile.subscribe.data.CurrentData;
import com.chargingpile.subscribe.services.CurrentDataService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.concurrent.FutureTask;

/**
 * 订阅者
 */
@Service
@Slf4j
public class SubscribeService {



    @Autowired
    private CurrentDataService currentDataService;
    CurrentData currentData = new CurrentData();

    @Bean
    @ServiceActivator(inputChannel = Contants.MQTT_SUBSCRIBE_CHANNEL)
    public MessageHandler messageHandler() {
        MessageHandler messageHandler = message -> {
            //System.out.println("订阅者订阅消息头是：" + message.getHeaders().toString());
            System.out.println("订阅者订阅消息内容是：" + message.getPayload().toString());
            JSONObject jsonObject = null;
            try{
                jsonObject = JSONObject.fromObject(message.getPayload().toString());
                temperatureHandler(jsonObject);

            }catch (Exception e){
                e.printStackTrace();
            }
        };
        return messageHandler;
    }

    private void temperatureHandler(JSONObject jsonObject) {
        String helmet_id = jsonObject.getString("helmet_id");
        long time = System.currentTimeMillis();
        double temperature = jsonObject.getDouble("temperature");
        FutureTask<Void> futureTask = new FutureTask<>(() -> {
            //temperatureHistory.setHelmet_id(helmet_id);
            //temperatureHistory.setTime(System.currentTimeMillis());
            //temperatureHistory.setTemperature(temperature);
            //temperatureService.saveTemperature(temperatureHistory);
            return null;
        });
        new Thread(futureTask).start();
        currentData.setHelmet_id(helmet_id);
        currentData.setTime(time);
        currentData.setTemperature(temperature);
        currentDataService.saveCurrentData(currentData);
    }
}
