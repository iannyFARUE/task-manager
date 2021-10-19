package com.firdiantechnologies.taskmanager.task;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TaskApi {

    @GetMapping("/")
    public String home(){
        return "home/welcome";
    }
}
