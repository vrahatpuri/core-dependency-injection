package guru.springframework.controller;

import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService")GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        greetingService.sayGreeting();
        return "setterInjector";
    }

}
