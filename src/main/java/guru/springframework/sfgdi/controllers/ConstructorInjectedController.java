/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 *
 * @author None
 */
@Controller
public class ConstructorInjectedController
{
    private final GreetingService greetingService;

    //Did you know that the "@Autowired" annotation is not required for 
    //constructors in Spring5
    public ConstructorInjectedController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }
    
    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
