package com.application.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationTestController {

    @GetMapping("/applicationTest")
    @ResponseBody
    public String getApplication(){
        return "applicationTest";

    }
}
