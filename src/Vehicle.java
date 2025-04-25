import java.time.LocalDate;
public class Vehicle implements Maintainable {
    private String brand;
    private String model;
    private String spz;
    private int year;
    private LocalDate lastMaintenanceDate;


    public void displayInfo(){
        System.out.println(getBrand()+" "+getModel()+" ("+getYear()+") SPZ: "+getSpz());
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getSpz() {
        return spz;
    }
    public void setSpz(String spz) {
        this.spz = spz;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public LocalDate getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public Vehicle(int year, String brand, String model, String spz) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.spz = spz;
        lastMaintenanceDate = LocalDate.now().minusYears(1);
    }
    @Override
    public void performMaintenance() {
        lastMaintenanceDate = LocalDate.now();
        System.out.println(getSpz()+" maintenance done. Last maintenance date: "+lastMaintenanceDate);
    }
}
