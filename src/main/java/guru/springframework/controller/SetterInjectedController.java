package guru.springframework.controller;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService service){
        this.greetingService = service;
    }

    public String sayHello(){
        greetingService.sayGreeting();
        return "setterinjector";
    }

}
