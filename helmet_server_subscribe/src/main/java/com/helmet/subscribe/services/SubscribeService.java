package com.helmet.subscribe.services;

import com.helmet.subscribe.common.Contants;
import com.helmet.subscribe.data.Data;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * 订阅者
 */
@Service
@Slf4j
public class SubscribeService {

    @Autowired
    private DataService dataService;


    @Bean
    @ServiceActivator(inputChannel = Contants.MQTT_SUBSCRIBE_CHANNEL)
    public MessageHandler messageHandler() {

        MessageHandler messageHandler = new MessageHandler() {
            @Override
            public void handleMessage(Message<?> message) throws MessagingException {
                System.out.println("订阅者订阅消息头是：" + message.getHeaders());
                System.out.println("订阅者订阅消息内容是：" + message.getPayload());
                Data data = new Data();
                if (message.getPayload().toString().contains("{")) {
                    JSONObject jsonObject = JSONObject.fromObject(message.getPayload().toString());
                    data.setSensor(jsonObject.getString("sensor"));
                    data.setTime(jsonObject.getInt("time"));
                    data.setJing(jsonObject.getDouble("jing"));
                    data.setWei(jsonObject.getDouble("wei"));
                    dataService.saveData(data);
                }

            }
        };
        return messageHandler;
    }

}
