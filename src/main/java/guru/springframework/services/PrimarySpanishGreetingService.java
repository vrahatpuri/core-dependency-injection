package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreetingService implements GreetingService{

    @Override
    public void sayGreeting() {
        System.out.println("Hola del Servicio de Saludo Principal de Español");
    }
}
