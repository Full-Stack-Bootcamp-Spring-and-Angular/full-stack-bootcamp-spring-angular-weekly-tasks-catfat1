package app.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static  void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
        Plane plane=(Plane) container.getBean("plane");
        Car car=(Car) container.getBean("car");
        plane.save();
        car.save();

    }
}