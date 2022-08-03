package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class Bus extends HeavyVehicle{
    private final String number_of_wheels="6";
    private String fuel;
    private String safety;
    private String vehicle;
    public Bus(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels, fuel);
        this.safety=safety;
        this.fuel=fuel;
        vehicle="Bus";
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
        List<String>bus=new ArrayList<>();
        bus.add(getVehicle_type());
        bus.add(getVehicle());
        bus.add(getNumber_plate());
        bus.add(getModel_number());
        bus.add(getFuel());
        bus.add(getNumber_of_wheels());
        bus.add(getEngin().getEmginNumber());
        bus.add(getEngin().getNumber_of_stroke());
        bus.add(getSafety());
        return bus;
    }
}
