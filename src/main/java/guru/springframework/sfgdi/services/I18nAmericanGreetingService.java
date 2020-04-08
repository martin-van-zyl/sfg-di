/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 *
 * @author None
 */
@Profile("AM")
@Service("i18nService")
public class I18nAmericanGreetingService implements GreetingService
{

    @Override
    public String sayGreeting()
    {
        return "Hey, how yall doin - AM";
    }
    
}
