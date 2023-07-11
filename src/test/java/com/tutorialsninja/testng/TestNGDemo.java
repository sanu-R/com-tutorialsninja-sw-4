package com.tutorialsninja.testng;

import org.testng.annotations.*;

public class TestNGDemo {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am in before method");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am in before Test");
    }
    @Test
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am in after Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am in after method");
    }






}
