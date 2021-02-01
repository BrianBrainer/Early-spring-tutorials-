package com.ryan.springboot.web.springbootsimplewebapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args)
    {
        //load the spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve beans from container
        //Coach theCoach = context.getBean("myCoach", Coach.class);
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call method on bean
        //System.out.println(theCoach.getDailyWorkout());
        //System.out.println(theCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getTeamName());
        System.out.println(cricketCoach.getEmailAddress());

        //close the context
        context.close();
    }
}
