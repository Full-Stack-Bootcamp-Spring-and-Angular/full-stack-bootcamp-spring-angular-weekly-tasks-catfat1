package beanInitDestroy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        DatabaseOperations databaseOperations = (DatabaseOperations) container.getBean("intDestoy");
        container .close();
        // ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ((ClassPathXmlApplicationContext)container) .close();






    }
}