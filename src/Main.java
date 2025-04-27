public class Main {
    public static void main(String[] args) {
               CarPark mujPark = new CarPark();
               PrivateVehicle vehicleInstance1 = new PrivateVehicle(2003, "Skoda", "Octavia", "1AB 1234", 5);
               PrivateVehicle vehicleInstance2 = new PrivateVehicle(2015, "BMW", "X5", "999 9999", 7);
               PrivateVehicle vehicleInstance3 = new PrivateVehicle(2016, "Skoda", "Rapid", "5AY 7060", 5);
               PrivateVehicle vehicleInstance4 = new PrivateVehicle(2020, "Volvo", "V90", "HAJ LOUN", 5);
               WorkVehicle vehicleInstance5 = new WorkVehicle(2011, "Ford", "Transit", "8T1 0099", 1.2);
               WorkVehicle vehicleInstance6 = new WorkVehicle(2020, "Mercedes", "Sprinter", "9T1 0099", 1.4);
               PrivateVehicle vehicleInstance7 = new PrivateVehicle(2016, "Opel", "Insignia", "9T1 0099", 5);
       try {
               mujPark.addVehicle(vehicleInstance1);
               mujPark.addVehicle(vehicleInstance2);
               mujPark.addVehicle(vehicleInstance3);
               mujPark.addVehicle(vehicleInstance4);
               mujPark.addVehicle(vehicleInstance5);
               mujPark.addVehicle(vehicleInstance6);
               mujPark.addVehicle(vehicleInstance7);
       }
       catch (DuplicateSpzException e)     {
               System.err.println(e.getMessage());
       }

            mujPark.performMaintenanceOnVehicle("HAJ LOUN");
            mujPark.performMaintenanceOnVehicle("999 9999");

            mujPark.displayAllVehicles();

            String firstCarBrand = vehicleInstance1.getBrand();
            System.out.println(firstCarBrand+" "+vehicleInstance1.getModel());
            System.out.println(vehicleInstance1.getSpz());
            vehicleInstance1.setSpz("8AH 8888");
            System.out.println(vehicleInstance1.getSpz());

            mujPark.displayVehiclesNeedingMaintenance(6);

            mujPark.driveAllVehicles();
    }
}