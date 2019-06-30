package yzhuang.model;

/**
 * @author yzhuang
 */

public class SUV extends Vehicle {

    @Override
    public void start() {
        System.out.println("Tesla Model X started");
    }

    @Override
    public void stop() {
        System.out.println("Tesla Model X stopped");
    }
}
