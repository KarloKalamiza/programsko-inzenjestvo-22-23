package model;

import apstraction.IParkable;
import constants.Constants;

public class Terminal implements IParkable {
    private Train smallTrain;
    private Train largeTrain;
    private int ticketEarnings = Constants.ZERO;

    public Terminal(Train.Size trainSize) {
        if (trainSize == Train.Size.SMALL){
            smallTrain = new Train(trainSize);
        } else if (trainSize == Train.Size.LARGE){
            largeTrain = new Train(trainSize);
        }
    }

    public void printTicketEarnings(){
        System.out.println("Total ticket earnings: " + ticketEarnings + "$");
    }

    @Override
    public void park(Employee employee, Vehicle vehicle) {
        if (vehicle.getSizeType() == Vehicle.VehicleType.Car || vehicle.getSizeType() == Vehicle.VehicleType.Van){
            employee.checkVehicle(vehicle, smallTrain);
        } else if (vehicle.getSizeType() == Vehicle.VehicleType.Bus || vehicle.getSizeType() == Vehicle.VehicleType.Truck){
            employee.checkVehicle(vehicle, largeTrain);
        }

        ticketEarnings += vehicle.getFare();
        System.out.println();
    }
}
