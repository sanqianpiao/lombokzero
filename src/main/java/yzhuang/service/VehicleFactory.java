package yzhuang.service;

import yzhuang.model.Car;
import yzhuang.model.Pickup;
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
            default:
                throw new IllegalArgumentException();
        }
    }
}
