package VehicleDemo;

public class LightVehicle extends Vehicle{

    private String vehicle_type;
    private String fuel="Petrol";
    public LightVehicle(String number_plate, String model_number, Engin engin, String number_of_wheels,String fuel) {
        super(number_plate,model_number,engin,number_of_wheels);
        this.vehicle_type = "Light";
        //this.fuel=fuel;

    }
    public LightVehicle(){}

    public String getVehicle_type() {
        return vehicle_type;
    }

    public String getFuel() {
        return fuel;
    }
    public void drive()
    {
        System.out.println("You are driving "+fuel+" Engine Vehicle");
    }
}
