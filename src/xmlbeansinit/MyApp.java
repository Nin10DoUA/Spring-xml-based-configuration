package xmlbeansinit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("MAIN START HERE:");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.properties2.xml");
        System.out.println("After CONTEXT IS UP");
        Coach coach =  context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach2", Coach.class);
        Coach coach3 = context.getBean("myCoach3", Coach.class);
        System.out.println(coach.doWorkout());
        System.out.println(coach.getFortune());
        System.out.println(coach2.doWorkout());
        System.out.println(coach2.getFortune());
        System.out.println(coach3.doWorkout());
        System.out.println(coach3.getFortune());
        System.out.println(coach3.toString());



        context.close();


    }
}
