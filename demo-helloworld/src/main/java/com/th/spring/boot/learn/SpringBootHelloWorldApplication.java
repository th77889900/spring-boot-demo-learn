package com.th.spring.boot.learn;

import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：tengu
 * @date ：Created in 2020/12/8 5:52 下午
 */
@SpringBootApplication
@RestController
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
    }

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who) {
        if (StrUtil.isEmpty(who)) {
            return "who say hello world";
        }
        String s = who + "say hello world";
        System.out.println(s);
        return s;

    }

}
