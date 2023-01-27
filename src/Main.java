import model.*;

public class Main {
    public static void main(String[] args) {

        Terminal terminalSmallTrain = new Terminal(Train.Size.SMALL);
        Terminal terminalLargeTrain = new Terminal(Train.Size.LARGE);

        Employee employeeSmallTrain = new EmployeeBuilder("Karlo").build();
        Employee employeeLargeTrain = new EmployeeBuilder("Ivan").setSalary(0.11).build();

        Vehicle car = new Vehicle(Vehicle.VehicleType.Car, 40, 5);
        Vehicle van = new Vehicle(Vehicle.VehicleType.Van, 18, 60);
        Vehicle bus = new Vehicle(Vehicle.VehicleType.Bus, 40, 40);
        Vehicle truck = new Vehicle(Vehicle.VehicleType.Truck, 5, 2);

        terminalSmallTrain.park(employeeSmallTrain, car);
        terminalSmallTrain.park(employeeSmallTrain, van);
        terminalLargeTrain.park(employeeLargeTrain, bus);
        terminalLargeTrain.park(employeeLargeTrain, truck);

        System.out.println("----------------------------------------------------------------------");
        terminalSmallTrain.printTicketEarnings();
        terminalLargeTrain.printTicketEarnings();

        System.out.println("----------------------------------------------------------------------");

        employeeSmallTrain.getEarnings();
        employeeLargeTrain.getEarnings();
        System.out.println("----------------------------------------------------------------------");
    }
}