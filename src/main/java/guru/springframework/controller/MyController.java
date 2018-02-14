package guru.springframework.controller;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello from My Controller Class");
        greetingService.sayGreeting();
        return " ";
    }
}
