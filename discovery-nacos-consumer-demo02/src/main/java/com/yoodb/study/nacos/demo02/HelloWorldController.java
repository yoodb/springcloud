package com.yoodb.study.nacos.demo02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/{id}")
    public Object consumer(@PathVariable("id")Integer id) {
        return restTemplate.getForObject("http://discovery-nacos-provider/provider/" + id, Object.class);
    }
}