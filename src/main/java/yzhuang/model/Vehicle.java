package yzhuang.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yzhuang
 */

@AllArgsConstructor
@Data
public class Vehicle {

    String plateNumber;
    int passengerNumber;

    public Vehicle() {
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

}
