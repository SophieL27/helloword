package com.vms.helloword.constroller;

import com.vms.helloword.entity.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.*;

@RestController
public class ParamsController {
    @RequestMapping(value="/getTest1",method= RequestMethod.GET)
    public String getTest1(){
        return "GET请求";
    }
    @RequestMapping(value="/getTest2",method=RequestMethod.GET)
    public String getTest2(String nickname,String phone){
        System.out.println("nickname:"+nickname);
        System.out.println("phone:"+phone);
        return "GET请求";
    }
    @RequestMapping(value="/getTest3",method=RequestMethod.GET)
    public String getTest3(@RequestParam(value = "nickname",required = false) String name){
        System.out.println("nickname:"+name);
        return "GET请求";
    }
    @RequestMapping(value="/postTest1",method=RequestMethod.POST)
    public String postTest1(){
        return "POST请求";
    }
    @RequestMapping(value="/postTest2",method=RequestMethod.POST)
    public String postTest2(String nickname,String phone){
        System.out.println("nickname:"+nickname);
        System.out.println("phone:"+phone);
        return "POST请求";
    }
    @RequestMapping(value="/postTest3",method=RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST请求";
    }
    @GetMapping("/test/**")
    public String test(){
        return "通配符请求";

    }

}
