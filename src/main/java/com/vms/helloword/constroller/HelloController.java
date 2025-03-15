package com.vms.helloword.constroller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(String nickname ,String phone){
        System.out.println(phone);
        return "你好"+nickname;
    }
}
