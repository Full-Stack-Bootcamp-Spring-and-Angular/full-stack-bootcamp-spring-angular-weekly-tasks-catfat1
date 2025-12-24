package beanScops;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        Circle circle = (Circle) container.getBean("circleSingleTone");
        Circle circle1 = (Circle) container.getBean("circleSingleTone");
        Circle circle2 = (Circle) container.getBean("circleSingleTone");
        System.out.println("circleSingleTone");
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println("circlePrototype");
        Circle circle20 = (Circle) container.getBean("circlePrototype");
        Circle circle21 = (Circle) container.getBean("circlePrototype");
        Circle circle22 = (Circle) container.getBean("circlePrototype");
        System.out.println(circle20);
        System.out.println(circle21);
        System.out.println(circle22);


        Square square = (Square) container.getBean("square");
        Square square1 = (Square) container.getBean("square");

        //square.draw();
        System.out.println("default as as SingleTone");
        System.out.println(square);
        System.out.println(square1);






    }
}