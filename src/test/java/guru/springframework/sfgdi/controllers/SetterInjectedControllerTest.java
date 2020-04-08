/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author None
 */
public class SetterInjectedControllerTest
{
    SetterInjectedController controller;
            
    public SetterInjectedControllerTest()
    {
    }
    
    
    @BeforeEach
    public void setUp()
    {
        System.out.println("setuszup!!!");
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }
    
    @AfterEach
    public void tearDown()
    {
        System.out.println("breakitDown...");
    }


    /**
     * Test of getGreeting method, of class SetterInjectedController.
     */
    @Test
    public void testGetGreeting()
    {
        System.out.println(controller.getGreeting());
    }
    
}
