package guru.springframework.controller;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService service){
        this.greetingService = service;
    }

    public String sayHello(){
        greetingService.sayGreeting();
        return "constructorInjected";
    }
}
