package rfronteddu.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService
{
    @Override public String getGreeting () {
        return "Setter -- Hello World";
    }
}
