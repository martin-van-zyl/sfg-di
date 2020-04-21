/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgdi.controllers;

import guru.services.ConstructorGreetingService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author None
 */
public class ConstructorInjectedControllerTest
{
    ConstructorInjectedController controller;
    
    public ConstructorInjectedControllerTest()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
        System.out.println("setuszup!!!");
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    
    @AfterEach
    public void tearDown()
    {
        System.out.println("breakitDown...");
    }

    /**
     * Test of getGreeting method, of class ConstructorInjectedController.
     */
    @Test
    public void testGetGreeting()
    {
        System.out.println(controller.getGreeting());
    }
    
}
