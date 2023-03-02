package rfronteddu.di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import rfronteddu.di.services.GreetingService;

// not recommended
@Controller
public class PropertyInjectedController
{
    @Autowired
    @Qualifier ("propertyGreetingServiceImpl")
    public GreetingService greetingService;

    public String getGreeting () {
        return greetingService.getGreeting ();
    }
}
