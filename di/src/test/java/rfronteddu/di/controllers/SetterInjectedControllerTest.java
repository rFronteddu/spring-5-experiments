package rfronteddu.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rfronteddu.di.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest
{

    SetterInjectedController controller;

    @BeforeEach void setup () {
        controller = new SetterInjectedController ();
        controller.setGreetingService (new ConstructorGreetingServiceImpl ());
    }

    @Test void getGreeting () {
        System.out.println (controller.getGreeting ());
    }
}