package com.springmvc.controller;

import com.springmvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //@Controller是为了让Spring IOC容器初始化时自动扫描到
@RequestMapping("/user")
public class UserController {

    @RequestMapping("hello")
    public String saHello(Model model){
        //方法声明Model类型的参数是为了把Action中的数据带到视图中
        model.addAttribute("msg","SpringMVC");
        //WEB-INF/jsp/hello.jsp
        return "hello";

    }
    //1.转发
    @RequestMapping("/zf")
    public String testZf(){
        return "test";
    }

    //2.重定向
    @RequestMapping("/redirect")
    public String testRedirect(){
        return "redirect:/index.jsp";
    }

    @RequestMapping("/redirect2")
    public String testRedirect2(){

        return "redirect:hello";
    }

    //3.提交的域名称和处理方法的参数名不一致
    //提交数据 http://localhost:8080/data2?keys=1
    @RequestMapping("/data2")
    public String hello2(@RequestParam("keys") String key){
        System.out.println(key);
        return "hello";
    }
    //提交的是一个对象
    //要求提交的表单域和对象的属性名一致,参数使用对象即可
    //如果使用对象的话,前端传递的参数名和对象名必须一致,否则就是null
    //提交数据 http://localhost:8080/data3?name=zs&id=1&age=18
    @RequestMapping("/data3")
    public String hello3(User user){
        System.out.println(user);
        return "hello";
    }

    //4.RestFul风格: 在SpringMVC中可以使用@PathVariable注解,让方法参数的值对应绑定到一个URL模板变量上
    @RequestMapping({"/commit/{p1}/{p2}"})
    public String testPathVariable(@PathVariable int p1, @PathVariable int p2, Model model){
        int reslut = p1 + p2;
        System.out.println(reslut);
        model.addAttribute("msg",reslut);
        return  "test";
    }

    @RequestMapping("/testRequestParam")
    //@RequestParam Integer id 前端参数和后端方法必须一致
    //@RequestParam(value = "ids") Integer id 指定前端的参数和后端的参数对应
    //@RequestParam(value = "ids",required = false) Integer id 参数值是否必须默认为true
    //@RequestParam(value = "ids",required = false,defaultValue = "10" 默认值是true
    public String testRequestParam(@RequestParam(value = "ids",required = true,defaultValue = "10") Integer id){
        System.out.println("测试");
        System.out.println(id);
        return "test";
    }
}
