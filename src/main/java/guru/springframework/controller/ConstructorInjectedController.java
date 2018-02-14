package guru.springframework.controller;

import guru.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService service){
        this.greetingService = service;
    }

    public String sayHello(){
        greetingService.sayGreeting();
        return "constructorInjected";
    }
}
