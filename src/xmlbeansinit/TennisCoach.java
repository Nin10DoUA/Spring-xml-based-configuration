package xmlbeansinit;

public class TennisCoach implements Coach {

    private Fortune fortune;

    public TennisCoach(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String doWorkout() {
        return "take a Raquet!";
    }

    @Override
    public String getFortune() {
        return "Tennis: "+fortune.getFortune();
    }


}
