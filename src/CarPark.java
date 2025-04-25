import java.time.LocalDate;
import java.util.ArrayList;
public class CarPark {
    ArrayList<Vehicle> cars = new ArrayList<>();
    public void addVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            this.cars.add(vehicle);
        }
    }
    public void displayAllVehicles() {
        if (!this.cars.isEmpty()) {
            System.out.println("Vehicles in garage:");
            System.out.println("--------------------");
            for (Vehicle v : this.cars){
                v.displayInfo();
            }
            System.out.println("--------------------");
        }
        else
            System.out.println("No vehicles in garage");
    }
    public CarPark() {
        this.cars = new ArrayList<>();
    }

    public void performMaintenanceOnVehicle(String spz){
        boolean found = false;
        for (Vehicle v : this.cars){
            if (spz.equals(v.getSpz())){
                v.performMaintenance();
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println(spz+" not found");
        }
    }
    public void displayVehiclesNeedingMaintenance(int months){
        System.out.println("Vehicles that need maintenance:");
        LocalDate currentDate = LocalDate.now();
        boolean foundAny = false;
        for (Vehicle v : this.cars){
            LocalDate lastMaintenance = v.getLastMaintenanceDate();
            LocalDate nextMaintenance = lastMaintenance.plusMonths(months);
            if (currentDate.isAfter(nextMaintenance)){
                v.displayInfo();
                foundAny = true;
                System.out.println(("Last maintenance: " + lastMaintenance+" next maintenance: " + nextMaintenance));
            }

        }
        if (!foundAny){
            System.out.println("No vehicles that need maintenance");
        }
    }
}
