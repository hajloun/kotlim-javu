public class WorkVehicle extends Vehicle {
    private double maxCapacity;
    public WorkVehicle(int year, String brand, String model, String spz, double maxCapacity) {
        super(year,brand,model,spz);
        this.maxCapacity = maxCapacity;
    }
    public double getMaxCapacity() {
        return maxCapacity;
    }
    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Work vehicle with capacity: " + maxCapacity + "t");
    }

}