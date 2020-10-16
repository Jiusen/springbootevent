package com.example.springbootevent.controller.event;

import com.example.springbootevent.listener.ListenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Jiusen Guo
 * @Date 2020/10/16 15:43
 * @Version 1.0
 */
@RestController
public class EventController {

    @Autowired
    ListenerService listenerService;

    @GetMapping("/event/{id}")
    public String trigEvent(@PathVariable Integer id){
        listenerService.pub("触发代码: " + id);
        return "ok";
    }
}
