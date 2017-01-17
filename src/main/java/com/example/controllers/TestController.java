package com.example.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	
    @SendTo("/topic/notification")
    @MessageMapping(value = "/hello")
    public String sendToMenuItems(String menuItem)  {
        return "teste";
    }
	
}
