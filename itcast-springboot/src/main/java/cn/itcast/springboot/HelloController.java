package cn.itcast.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@EnableAutoConfiguration //启动自动配置
public class HelloController {

    @GetMapping("show")
    public String test(){
        return "hello springboot 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
