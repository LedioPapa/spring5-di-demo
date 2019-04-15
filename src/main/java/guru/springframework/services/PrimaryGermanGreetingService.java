package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Autowired //1st way to inject GreetingRepositoryImpl - the only implementation of GreetingRepository so far
    private GreetingRepository greetingRepository;

    //2nd way to inject GreetingRepositoryImpl
//    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
//        this.greetingRepository = greetingRepository;
//    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
