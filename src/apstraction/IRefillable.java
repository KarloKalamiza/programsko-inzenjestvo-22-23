package apstraction;

import model.Train;
import model.Vehicle;

public interface IRefillable {
    public void checkVehicle(Vehicle vehicle, Train train);
}
