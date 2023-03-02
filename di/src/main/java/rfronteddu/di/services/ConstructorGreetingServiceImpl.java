package rfronteddu.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
// by using primary the ConstructorInjectedController doesn't need to qualify the name of the bean
public class ConstructorGreetingServiceImpl implements GreetingService
{
    @Override public String getGreeting () {
        return "Constructor -- Hello World";
    }
}
