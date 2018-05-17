public class Motorcycle extends Vehicle {

    private String motorcycleType;


    public Motorcycle(String vehicleType, int wheels, String manufacturer, int releaseYear, String motorcycleType) {
        super(vehicleType, wheels, manufacturer, releaseYear);
        this.motorcycleType = motorcycleType;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    public String toString(){
        String formattedString = "Type: " + this.getVehicleType() + " | Wheels: " + this.getWheels() + " | Manufacturer: " +
                this.getManufacturer() + " | Year: " + this.getReleaseYear() + " | Type: " + this.getMotorcycleType() + "\n";
        return formattedString;
    }
}
