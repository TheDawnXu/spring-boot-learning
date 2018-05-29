package com.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * echo "# spring-boot-learning" >> README.md
 git init
 git add README.md
 git commit -m "first commit"
 git remote add origin git@github.com:TheDawnXu/spring-boot-learning.git
 git push -u origin master
 * @Author xdc90
 * @Date 2018/5/29
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String helloWorld(){
        return "Hello Spring Boot";
    }
}
