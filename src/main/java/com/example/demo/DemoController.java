package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/v1/{text}")
    public String demoV1(@PathVariable String text){
        StringBuilder sb = new StringBuilder(text);
        sb.append("두번째");
        return sb.toString();
    }

}
