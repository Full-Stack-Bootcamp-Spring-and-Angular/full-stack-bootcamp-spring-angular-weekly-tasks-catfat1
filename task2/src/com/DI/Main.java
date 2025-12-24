package com.DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("applicationContext.xml");

        Circle circle=(Circle) container.getBean("circle");
        Square square=(Square) container.getBean("square");
        circle.draw();
        square.draw();



    }
}