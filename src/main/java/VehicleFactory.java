public class VehicleFactory {
    public Vehicle getVehicle(String type){
        switch (type.toUpperCase()){
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            case "TRUCK":
                return new Truck();
        }
        return null;
    }
}
