
public class Main {
    public static void main(String[] args) {
            CarPark mujPark = new CarPark();
            Vehicle vehicleInstance1 = new Vehicle(2003, "Skoda", "Octavia", "1AB 1234");
            Vehicle vehicleInstance2 = new Vehicle(2015, "BMW", "X5", "999 9999");
            Vehicle vehicleInstance3 = new Vehicle(2016, "Skoda", "Rapid", "5AY 7060");
            mujPark.addCars(vehicleInstance1);
            mujPark.addCars(vehicleInstance2);
            mujPark.addCars(vehicleInstance3);
            mujPark.allVehicles();
    }
}