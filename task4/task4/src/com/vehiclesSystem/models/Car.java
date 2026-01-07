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
public class Car  implements vehicle {
    int id;
    String model;
    vehicleType type= vehicleType.plane;

    @Autowired
    DatabaseOperation databaseOperation ;
    public  Car(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }
}
