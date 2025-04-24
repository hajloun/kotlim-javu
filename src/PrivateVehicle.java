public class PrivateVehicle extends Vehicle {
    private int seatCount;
    public PrivateVehicle(int year, String brand, String model, String spz, int seatCount) {
        super(year,brand,model,spz);
        this.seatCount = seatCount;
    }
    public int getSeatCount() {
        return seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Private vehicle with: " + seatCount + " seats");
    }

}