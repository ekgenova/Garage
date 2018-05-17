public class Bicycle extends Vehicle{

   private String model;

    public Bicycle(String vehicleType, int wheels, String manufacturer, int releaseYear, String model) {
        super(vehicleType, wheels, manufacturer, releaseYear);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        String formattedString = "Type: " + this.getVehicleType() + " | Wheels: " + this.getWheels() + " | Manufacturer: " +
                this.getManufacturer() + " | Year: " + this.getReleaseYear() + " | Model: " + this.getModel() + "\n";
        return formattedString;
    }
}
