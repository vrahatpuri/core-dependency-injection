package guru.springframework.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("HI VIREN!");
        return "foo";
    }
}
