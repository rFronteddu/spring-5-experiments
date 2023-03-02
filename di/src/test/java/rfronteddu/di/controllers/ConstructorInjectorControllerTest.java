package rfronteddu.di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rfronteddu.di.services.ConstructorGreetingServiceImpl;

class ConstructorInjectorControllerTest
{
    ConstructorInjectedController controller;
    @BeforeEach void setUp () {
        controller = new ConstructorInjectedController (new ConstructorGreetingServiceImpl ());
    }

    @Test void sayGreeting () {
        System.out.println (controller.getGreeting ());
    }
}