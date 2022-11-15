package br.com.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Service("i18nService")
public class I18PortugueseService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Olá Mundo - PT";
    }
}
