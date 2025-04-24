public class Vehicle {
    private String brand;
    private String model;
    private String spz;
    private int year;
    public void carInfo(){
        System.out.println(brand+" "+model+" ("+year+") SPZ: "+spz);
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

    public Vehicle(int year, String brand, String model, String spz) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.spz = spz;
    }
}
