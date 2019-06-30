package yzhuang;

import yzhuang.model.Vehicle;
import yzhuang.service.VehicleFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        final Vehicle v0 = VehicleFactory.createVehicle(0);
        v0.getPassengerNumber();

        v0.start();
    }
}
