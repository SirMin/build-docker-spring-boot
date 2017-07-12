package com.palmaplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhiwei.min on 2017/7/11.
 */
@SpringBootApplication
@RestController
@RequestMapping("/")
public class App {

    @GetMapping
    public Map test() {
        return new HashMap() {
            {
                this.put("aa","bb");
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
