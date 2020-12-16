package com.myConpay.accounting.controllers;

import com.myConpay.accounting.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private AtomicLong counter = new AtomicLong();
    @GetMapping(path = "v1/greeting")
//    Greeting所在的位置就是返回值
//    RequestParam会指明path中的路径要求
    public Greeting sayHello(@RequestParam("name") String name){
        return new Greeting(counter.incrementAndGet(),String.format("Hello,%s",name));
    }
}
