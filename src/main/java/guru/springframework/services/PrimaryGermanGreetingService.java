package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public void sayGreeting() {
        System.out.println("Hallo vom Primary German Service");
    }
}
