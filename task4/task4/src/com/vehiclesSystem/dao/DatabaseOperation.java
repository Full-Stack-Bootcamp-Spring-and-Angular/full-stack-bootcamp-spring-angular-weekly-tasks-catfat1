package com.vehiclesSystem.dao;

import com.vehiclesSystem.models.vehicle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Scope("singleton")
@Component
public class DatabaseOperation {
    //to read datad in properties files
    @Value("${database.username}")
    String username;

    @Value("${database.password}")
    String password;

    @Value("${database.drive}")
    String drive;

    @Value("${database.url}")
    String url;

    Connection conn ;

    @PostConstruct
    public void init ()
        {
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




    public void  saveVehicle(vehicle vehicle) {

        String sql = "INSERT INTO vehicle (id,model,type) VALUES (?,?,?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, vehicle.getId());
            ps.setString(2, vehicle.getModel());
            ps.setString(3, String.valueOf(vehicle.getType()));

            ps.executeUpdate();
            System.out.println("Vehicle saved successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
        //return vehicle;
    }



}
