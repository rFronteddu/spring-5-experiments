package rfronteddu.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile ("IT")
@Service ("i18nService")
public class I18nItalianGreetingService implements GreetingService
{
    @Override public String getGreeting () {
        return "Ciao - Italian Profile Loaded";
    }
}
