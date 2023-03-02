package rfronteddu.di.controllers;

import org.springframework.stereotype.Controller;
import rfronteddu.di.services.GreetingService;

// preferred, note that autowired is not necessary here
@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    public ConstructorInjectedController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting () {
        return greetingService.getGreeting ();
    }
}
