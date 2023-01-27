package model;

import constants.Constants;

public class Vehicle {
    public enum VehicleType { Car, Van, Bus, Truck};
    private VehicleType type;
    private int fare;
    private int batterySize;
    private int gasSize;

    public Vehicle(VehicleType type, int batterySize, int gasSize) {
        this.type = type;
        this.batterySize = batterySize;
        this.gasSize = gasSize;

        switch (type)
        {
            case Car -> {
                fare = Constants.CAR_PRICE;
                break;
            }

            case Van -> {
                fare = Constants.VAN_PRICE;
                break;
            }

            case Bus -> {
                fare = Constants.BUS_PRICE;
                break;
            }

            case Truck -> {
                fare = Constants.TRUCK_PRICE;
                break;
            }

            default -> {
                fare = Constants.ZERO;
                break;
            }
        }
    }

    public VehicleType getType() {
        return type;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize() {
        batterySize = Constants.SIZE_HIGH;
    }

    public int getGasSize() {
        return gasSize;
    }

    public VehicleType getSizeType() {
        return type;
    }

    public void setGasSize() {
        gasSize = Constants.SIZE_HIGH;
    }
}
