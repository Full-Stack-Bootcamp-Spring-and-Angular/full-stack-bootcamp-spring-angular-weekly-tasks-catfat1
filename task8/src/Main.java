import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session =sessionFactory.getCurrentSession();


        //to add new object
       /* User user=new User("heba","123","eng_heba@gmail.com");
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        */


        //select where user id =1
      /*  session.beginTransaction();
        User user=session.get(User.class,1);
        System.out.println(user);*/


        //update
       /* session.beginTransaction();
        User user=session.get(User.class,1);
        user.setPassword("taha");
        session.save(user);
        session.getTransaction().commit();
*/



        //Delete
        session.beginTransaction();
        User user =session.get(User.class,2);
        session.delete(user);
        session.getTransaction().commit();








        }
    }
