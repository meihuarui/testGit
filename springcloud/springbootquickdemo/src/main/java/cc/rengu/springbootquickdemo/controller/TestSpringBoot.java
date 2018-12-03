package cc.rengu.springbootquickdemo.controller;

import cc.rengu.springbootquickdemo.domain.UserDemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringBoot {

    @RequestMapping("hello")
    public UserDemo test(@RequestParam String name) {
        UserDemo userDemo = new UserDemo();
        userDemo.setName(name);
        return userDemo;
    }
}
