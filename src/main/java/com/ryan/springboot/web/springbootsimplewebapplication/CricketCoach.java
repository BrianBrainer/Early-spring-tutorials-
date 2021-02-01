package com.ryan.springboot.web.springbootsimplewebapplication;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String teamName;
    private String emailAddress;

    public CricketCoach()
    {
        System.out.println("In cricket coach constructor");
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("Hit the setFortuneService method fine");
        this.fortuneService = fortuneService;
    }
    public void setTeamName(String teamName)
    {
        System.out.println("Hit the setTeamName method fine");
        this.teamName = teamName;
    }
    public void setEmailAddress(String emailAddress)
    {
        System.out.println("Hit the setEmailAddress method fine");
        this.emailAddress = emailAddress;
    }
    public String getTeamName() {
        return teamName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    @Override
    public String getDailyFortune()
    {
        return "The cricket coach says: "+fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }


}
