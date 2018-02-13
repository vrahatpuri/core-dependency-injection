package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public void sayGreeting() {
        System.out.println("Hello from GreetingServiceImpl: Hello Java Gurus");
    }
}
