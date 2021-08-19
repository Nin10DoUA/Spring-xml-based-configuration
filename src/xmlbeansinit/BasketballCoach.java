package xmlbeansinit;

public class BasketballCoach implements Coach {

    private Fortune fortune;
    private String name;
    private String email;

    public BasketballCoach() {
        System.out.println("creating the instance of BasketCoach in NO-ARG constructor");
    }

    @Override
    public String doWorkout() {
        return "Jordan workout!";
    }

    @Override
    public String getFortune() {
        return "Basketball: " + fortune.getFortune();
    }

    public void setFortune(Fortune fortune) {
        System.out.println("setting BasketCoach dependencies via Setter");
        this.fortune = fortune;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "BasketballCoach{" +
                "fortune=" + fortune +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private void sayQuote() {
        System.out.println("INIT METHOD QUOTE");
    }

    private void byeQuote() {
        System.out.println("DESTROY METHOD QUOTE");
    }
}
