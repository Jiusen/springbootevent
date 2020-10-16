package com.example.springbootevent.listener.impl;

import com.example.springbootevent.event.MyEvent;
import com.example.springbootevent.listener.ListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/16 15:19
 * @Version 1.0
 */
@Component
public class ListenerServiceImpl implements ListenerService {

    @Autowired
    ApplicationContext context;

    @Override
    public void pub(String message) {
        context.publishEvent(new MyEvent(this, message));
    }
}
