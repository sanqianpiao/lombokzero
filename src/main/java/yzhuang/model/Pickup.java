package yzhuang.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * @author yzhuang
 */
@ToString
@AllArgsConstructor
public class Pickup extends Vehicle {

    public Pickup(final String plateNumber, final int passengerNumber) {
        super(plateNumber, passengerNumber);
    }
}
