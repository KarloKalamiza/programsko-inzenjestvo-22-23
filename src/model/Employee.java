package model;

import apstraction.IRefillable;
import constants.Constants;

public class Employee implements IRefillable {
    private final String name;
    private final double salary;
    private double earnings;

    public Employee(String name) {
        this.name = name;
        this.salary = 0.1;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
    }

    public void getEarnings() {
        System.out.println(name + "'s earnings are " + earnings + "$");
    }

    @Override
    public void checkVehicle(Vehicle vehicle, Train train) {
        if (train.getCapacity() > 0)
        {
            train.setCapacity();
            earnings += vehicle.getFare() + salary;

            if (vehicle.getGasSize() < Constants.SIZE_LOW){
                System.out.println(name + "'s" + vehicle.getSizeType() + " gas size is " +  vehicle.getGasSize() + "% full");
                System.out.println("Gas is refilling......");
                vehicle.setGasSize();
                System.out.println(name + "'s" + vehicle.getSizeType() + " gas size is " +  vehicle.getGasSize() + "% full");
            }

            if (vehicle.getBatterySize() < Constants.SIZE_LOW){
                System.out.println(name + "'s" + vehicle.getSizeType() + " gas size is " +  vehicle.getBatterySize() + "% full");
                System.out.println("Battery is refilling......");
                vehicle.setBatterySize();
                System.out.println(name + "'s" + vehicle.getSizeType() + " gas size is " +  vehicle.getBatterySize() + "% full");
            }
        }
    }
}
