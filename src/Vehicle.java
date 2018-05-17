public class Vehicle {

    //Private variables that define vehicle
    private int wheels;
    private String vehicleType;
    private String manufacturer;
    private int releaseYear;

    public Vehicle(String vehicleType, int wheels, String manufacturer, int releaseYear){
        this.wheels = wheels;
        this.vehicleType = vehicleType;
        this.manufacturer = manufacturer;
        this.releaseYear = releaseYear;
    }

    public int getWheels() {
        return wheels;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
