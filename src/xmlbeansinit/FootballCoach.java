package xmlbeansinit;

public class FootballCoach implements Coach {
    private Fortune fortune;

    public FootballCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String doWorkout() {
        return "take a football Ball!";
    }

    @Override
    public String getFortune() {
        return "Football: "+fortune.getFortune();
    }


}
