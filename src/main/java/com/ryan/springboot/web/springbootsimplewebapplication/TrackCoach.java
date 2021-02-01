package com.ryan.springboot.web.springbootsimplewebapplication;

public class TrackCoach implements Coach {

    //@Autowired
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService)
    {
        this.fortuneService = fortuneService;
    }

    public TrackCoach()
    {
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just keep running!" + fortuneService.getFortune();
    }

    public void doMyStartupStuff()
    {
        System.out.println("In the init method");
    }

    public void doMyDestroyStuff()
    {
        System.out.println("In the destroy method");
    }
}
