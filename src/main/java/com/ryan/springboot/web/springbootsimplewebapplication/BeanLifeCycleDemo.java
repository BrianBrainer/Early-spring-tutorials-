package com.ryan.springboot.web.springbootsimplewebapplication;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

    public static void main(String[] args)
    {
        //load config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        //get bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);


        //check if they're the same bean
        if(theCoach == alphaCoach)
        {
            System.out.println("They're the same object");
        }
        else
        {
            System.out.println("They're different objects");
        }

        System.out.println("memory Location for theCoach is "+theCoach);
        System.out.println("memory Location for alphaCoach is "+alphaCoach);

        context.close();
    }
}
