package rfronteddu.di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService
{
    @Override public String getGreeting () {
        return "Property -- Hello World";
    }
}
