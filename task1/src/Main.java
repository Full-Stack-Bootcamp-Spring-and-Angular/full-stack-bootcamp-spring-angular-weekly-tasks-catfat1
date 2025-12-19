import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner=new Scanner(System.in);

        Circle circle=(Circle) container.getBean("myCircle");
        Square square=(Square) container.getBean("mySquare");

        System.out.println("Enter Circle Radius: ");
        double radius=scanner.nextDouble();
        circle.setRadius(radius);
        double circleArea=circle.getArea();
        System.out.println(String.format("The area is :%.2f", circleArea));


        System.out.println("Enter Square Side: ");
        double side=scanner.nextDouble();
        square.setSide(side);
        double squareArea= square.getArea();
        System.out.println(String.format("The area is : %.2f",squareArea));



    }
}