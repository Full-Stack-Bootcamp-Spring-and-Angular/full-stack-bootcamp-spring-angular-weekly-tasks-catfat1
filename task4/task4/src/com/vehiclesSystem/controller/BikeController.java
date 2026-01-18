package com.vehiclesSystem.controller;

import com.vehiclesSystem.Enum.vehicleType;
import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.dao.DatabaseOperation;
import com.vehiclesSystem.models.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class VehicleController {

    @Autowired
    DatabaseOperation databaseOperation;

    public VehicleController(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(Config.class);
        DatabaseOperation dao = container.getBean(DatabaseOperation.class);
        Bike bike = container.getBean(Bike.class);
        bike.setId(12);
        bike.setModel("bike_model");
        bike.setType(vehicleType.bike);
        dao.saveVehicle(bike);
        container.close();


    }


}




