package yzhuang.service;

import yzhuang.model.Car;
import yzhuang.model.Pickup;
import yzhuang.model.SUV;
import yzhuang.model.Vehicle;

/**
 * @author yzhuang
 */

public class VehicleFactory {

    public static Vehicle createVehicle(int type) {
        switch (type) {
            case 0:
                return new Car();
            case 1:
                return new Pickup();
            case 3:
                return new SUV();
            default:
                throw new IllegalArgumentException();
        }
    }
}
