package com.example.springbootevent.listener;

import com.example.springbootevent.event.MyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/16 15:12
 * @Version 1.0
 */
@Component
public class EventListenerService implements ApplicationListener <MyEvent>{

    @Override
    public void onApplicationEvent(MyEvent myListener) {
        System.out.println("触发事件: " + myListener.getMessage());
    }
}
