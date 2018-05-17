public class GarageMain {

    public static void main(String[] args) {

        Garage garage = new Garage();

        Car car1 = new Car("car", 4, "Hyundai", 2007, "i30");
        Car car2 = new Car("car", 4, "Peugeot", 2007, "308");
        Car car3 = new Car("car", 4,"Skoda", 2012, "Octavia Mk3");
        Car car4 = new Car("car", 4,"Honda", 1997, "Civic Type R");

        Motorcycle bike1 = new Motorcycle("motorcycle", 2, "Kawasaki", 2018, "sportbike");
        Motorcycle bike2 = new Motorcycle("motorcycle", 2, "Suzuki", 2007, "sportbike");
        Motorcycle bike3 = new Motorcycle("motorcycle", 2, "Honda", 2008, "scooter" );

        Bicycle cycle1 = new Bicycle("bicycle", 2, "Calfee Design", 2012, "B30");
        Bicycle cycle2 = new Bicycle("bicycle", 2, "Giant", 2008, "TSX");

        garage.addVehicle(car1);
        garage.addVehicle(car2);
        garage.addVehicle(car3);
        garage.addVehicle(car4);
        garage.addVehicle(bike1);
        garage.addVehicle(bike2);
        garage.addVehicle(bike3);
        garage.addVehicle(cycle1);
        garage.addVehicle(cycle2);

        System.out.println(garage.vehicles.toString());

        garage.fixVehicle();


        garage.removeVehicleByID(2);
        System.out.println(garage.vehicles.toString());

        garage.removeVehicleByType("car");
        System.out.println(garage.vehicles.toString());

        garage.emptyGarage();
        System.out.println(garage.vehicles.toString());

    }
}
