package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {
    @Override
    public void sayGreeting() {
        System.out.println("Hello from Primary Greeting Service");
    }
}
