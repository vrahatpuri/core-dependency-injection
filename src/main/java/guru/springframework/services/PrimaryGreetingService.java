package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hello from Primary Greeting Service");
    }
}
