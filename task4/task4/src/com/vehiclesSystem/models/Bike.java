package com.vehiclesSystem.models;

import com.vehiclesSystem.dao.DatabaseOperation;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Setter
@Getter
@ToString
@Component
public class Bike implements vehicle{
    int id;
    String model;
    vehicleType type= vehicleType.bike;

    @Autowired
    DatabaseOperation  databaseOperation ;
    public Bike(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

}
