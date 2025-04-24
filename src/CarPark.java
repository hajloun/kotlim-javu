import java.util.ArrayList;
public class CarPark {
    ArrayList<Vehicle> cars = new ArrayList<>();
    public void addCars(Vehicle vehicle) {
        if (vehicle != null) {
            this.cars.add(vehicle);
        }
    }
    public void allVehicles() {
        if (!this.cars.isEmpty()) {
            System.out.println("Vehicles in garage:");
            System.out.println("--------------------");
            for (Vehicle v : this.cars){
                v.carInfo();
            }
            System.out.println("--------------------");
        }
        else
            System.out.println("No vehicles in garage");
    }
    public CarPark() {
        this.cars = new ArrayList<>();
    }
}
