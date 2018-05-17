import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicleByID(int index){
        vehicles.remove(index);
    }

    public void removeVehicleByType(String type){
        for (Iterator<Vehicle> vehicleIterator = vehicles.iterator(); vehicleIterator.hasNext();){
            Vehicle temp = vehicleIterator.next();
            if (temp.getVehicleType().equalsIgnoreCase(type)){
                vehicleIterator.remove();
            }
        }
    }

    public void fixVehicle(){
        int price = 0;
        for (Vehicle vehicles: vehicles){
            if (vehicles.getVehicleType().equalsIgnoreCase("car")){
                price = 450;
                System.out.println("Repair cost for a car is on average £" + price + " per job.");
            } else if (vehicles.getVehicleType().equalsIgnoreCase("motorcycle")){
                price = 200;
                System.out.println("Repair cost for a motorcycle is on average £" + 200 + " per job.");
            } else if (vehicles.getVehicleType().equalsIgnoreCase("bicycle")){
                price = 90;
                System.out.println("Repair cost for a bicycle is on average £" + 90 + " per job");
            }
        }
    }

    public void emptyGarage(){
        vehicles.removeAll(vehicles);
    }
}
