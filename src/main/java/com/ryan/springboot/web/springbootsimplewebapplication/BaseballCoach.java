package com.ryan.springboot.web.springbootsimplewebapplication;

public class BaseballCoach implements Coach{

    //@Autowired
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout()
    {
        return "Spend 30 minutes in the batting cage";
    }

    @Override
    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}
