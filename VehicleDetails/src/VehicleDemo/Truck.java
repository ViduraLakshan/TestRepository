package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class Truck extends HeavyVehicle{
    private final String number_of_wheels="6";
    private String fuel;
    private String safety;
    private String vehicle;
    public Truck(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels, fuel);
        this.safety=safety;
        this.fuel=fuel;
        vehicle="Truck";
    }

    @Override
    public String getNumber_of_wheels() {
        return number_of_wheels;
    }

    @Override
    public String getFuel() {
        return fuel;
    }

    public String getSafety() {
        return safety;
    }

    public String getVehicle() {
        return vehicle;
    }
    public List<String> getVehicleDetails()
    {
        List<String>truck=new ArrayList<>();
        truck.add(getVehicle_type());
        truck.add(getVehicle());
        truck.add(getNumber_plate());
        truck.add(getModel_number());
        truck.add(getFuel());
        truck.add(getNumber_of_wheels());
        truck.add(getEngin().getEmginNumber());
        truck.add(getEngin().getNumber_of_stroke());
        truck.add(getSafety());
        return truck;
    }
}
