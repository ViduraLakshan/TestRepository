package VehicleDemo;

public class HeavyVehicle extends Vehicle{

    private final String vehicle_type;
    private String fuel;


    public HeavyVehicle(String number_plate, String model_number, Engin engin, String number_of_wheels,String fuel) {
        super(number_plate,model_number,engin,number_of_wheels);
        vehicle_type = "Heavy";
        this.fuel=fuel;


    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public String getFuel() {
        return fuel;
    }
}
