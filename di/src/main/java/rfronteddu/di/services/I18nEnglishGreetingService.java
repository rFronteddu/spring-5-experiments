package rfronteddu.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// default -> if no profile is specified use this one
@Profile ({"ES", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService
{
    @Override public String getGreeting () {
        return "Hi - English Profile Loaded!";
    }
}
