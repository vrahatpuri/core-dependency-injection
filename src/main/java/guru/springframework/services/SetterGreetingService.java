package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public void sayGreeting(){
        System.out.println("Hello - from the SetterGreetingService bean");
    }
}
