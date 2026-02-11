package main.com.myApp.dao;

import main.com.myApp.model.UserModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class DatabaseOperation {



    //to read datad in properties files
    @Value("${database.username}")
    String username;

    @Value("${database.password}")
    String password;

    @Value("${database.driver}")
    String driver;

    @Value("${database.url}")
    String url;

    Connection conn ;


    @PostConstruct
    public void init () throws ClassNotFoundException {
            Class.forName(driver);

            try {

                conn= DriverManager.getConnection(url, username, password);
                System.out.println("database conected .........");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    @PreDestroy
    public  void close() throws SQLException {
        try{
            if (conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("database disconected .........");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


   public UserModel saveUser(UserModel user) {

        String sql = "INSERT INTO userlogin (userName,email,password,confirmPassword) VALUES (?,?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getUserName());

            ps.setString(2, user.getEmail());

            ps.setString(3, user.getPassword());

            ps.setString(4,user.getConfirmPassword());

            System.out.println(ps.toString());

            ps.executeUpdate();

            System.out.println("user saved successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }




}
