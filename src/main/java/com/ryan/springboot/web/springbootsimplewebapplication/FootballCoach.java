package com.ryan.springboot.web.springbootsimplewebapplication;

public class FootballCoach implements Coach {

    //@Autowired
    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Do 100 keep ups";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do it!" + fortuneService.getFortune();
    }

}