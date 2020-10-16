package com.example.springbootevent.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/16 14:53
 * @Version 1.0
 */
public class MyEvent extends ApplicationEvent {

    private String message;

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
