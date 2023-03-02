package rfronteddu.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rfronteddu.di.services.ConstructorGreetingServiceImpl;

class PropertyInjectorControllerTest
{
    PropertyInjectedController controller;

    @BeforeEach void setup () {
        controller = new PropertyInjectedController ();
        controller.greetingService = new ConstructorGreetingServiceImpl ();
    }

    @Test void getGreeting () {
        System.out.println (controller.getGreeting ());
    }
}