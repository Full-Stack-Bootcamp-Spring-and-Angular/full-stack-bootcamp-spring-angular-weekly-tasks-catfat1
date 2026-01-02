package com.vehiclesSystem;
import com.vehiclesSystem.config.Config;
import com.vehiclesSystem.dao.DatabaseOperation;
import com.vehiclesSystem.models.Bike;
import com.vehiclesSystem.models.Car;
import com.vehiclesSystem.models.Plane;
import com.vehiclesSystem.models.vehicleType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container =
                new AnnotationConfigApplicationContext(Config.class);

        DatabaseOperation dao = container.getBean(DatabaseOperation.class);

        Bike bike = container.getBean(Bike.class);
        bike.setId(1000);
        bike.setModel("bike_model");
        bike.setType(vehicleType.bike);
        dao.saveVehicle(bike);



        Plane plane = container.getBean(Plane.class);
        plane.setId(2000);
        plane.setModel("plane_model");
        plane.setType(vehicleType.plane);
        dao.saveVehicle(plane);



        Car car = container.getBean(Car.class);
        car.setId(3000);
        car.setModel("car_model");
        car.setType(vehicleType.car);
        dao.saveVehicle(car);




    }
}
