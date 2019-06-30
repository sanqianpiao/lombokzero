package yzhuang.service;

import yzhuang.model.Car;
import yzhuang.model.Vehicle;

/**
 * @author yzhuang
 */

public class VehicleFactory {

    public static Vehicle createVehicle(int type) {
        switch (type) {
            case 0:
                return new Car();
            default:
                throw new IllegalArgumentException();
        }
    }
}
