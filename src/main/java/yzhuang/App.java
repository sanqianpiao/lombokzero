package yzhuang;

import yzhuang.model.Vehicle;
import yzhuang.service.VehicleFactory;

public class App {
    public static void main(String[] args) {

        final Vehicle v0 = VehicleFactory.createVehicle(0);
        v0.start();

        final Vehicle v1 = VehicleFactory.createVehicle(1);
        v1.setPassengerNumber(5);
        v1.setPlateNumber("Tesla 1000");
        System.out.println(v1);

        System.out.println(new Vehicle("Roadster", 2));
    }
}
