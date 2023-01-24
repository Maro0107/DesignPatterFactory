public class Main {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        Car car1 = (Car)vehicleFactory.getVehicle("car");
        System.out.println(car1.getType());

        Car car2 = (Car)vehicleFactory.getVehicle("car");
        System.out.println(car2.getType());

        Truck truck = (Truck) vehicleFactory.getVehicle("truck");
        System.out.println(truck.getType());
    }
}
