package com.bqjr.Controller;

import com.bqjr.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GuangCai.Ling on 2018-2-26.
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return helloService.sayHello(name);
    }
}
