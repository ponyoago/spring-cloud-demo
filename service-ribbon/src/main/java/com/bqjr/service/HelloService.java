package com.bqjr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by GuangCai.Ling on 2018-2-26.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;


    public String sayHello(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
