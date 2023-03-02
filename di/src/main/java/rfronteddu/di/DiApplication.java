package rfronteddu.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rfronteddu.di.controllers.*;
import rfronteddu.di.services.I18nEnglishGreetingService;

@SpringBootApplication
public class DiApplication
{

    public static void main (String[] args) {
        var ctx =  SpringApplication.run (DiApplication.class, args);

        System.out.println ("----- MyController");
        MyController myController = (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello ();
        System.out.println (greeting);

        System.out.println ("----- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean ("propertyInjectedController");
        System.out.println (propertyInjectedController.getGreeting ());

        System.out.println ("----- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean ("setterInjectedController");
        System.out.println (setterInjectedController.getGreeting ());

        System.out.println ("----- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean ("constructorInjectedController");
        System.out.println (constructorInjectedController.getGreeting ());

        System.out.println ("----- Constructor");
        I18nController i18nController = (I18nController) ctx.getBean ("i18nController");
        System.out.println (i18nController.sayHello ());
    }
}
