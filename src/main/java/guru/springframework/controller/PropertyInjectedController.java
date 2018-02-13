package guru.springframework.controller;

import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
         greetingService.sayGreeting();
         return"PropertyInjected";
    }
}
