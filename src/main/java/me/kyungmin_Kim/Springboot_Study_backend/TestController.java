package me.kyungmin_Kim.Springboot_Study_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired //TestService 빈 주입.
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMember(){
        List<Member> members = testService.getAllMember();
        return members;
    }
}
