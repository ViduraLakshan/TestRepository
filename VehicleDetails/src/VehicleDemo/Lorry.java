package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class Lorry extends HeavyVehicle{
    private final String number_of_wheels="6";
    private String fuel;
    private String safety;
    private String vehicle;
    public Lorry(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels, fuel);
        this.safety=safety;
        this.fuel=fuel;
        vehicle="Lorry";
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
        List<String>lorry=new ArrayList<>();
        lorry.add(getVehicle_type());
        lorry.add(getVehicle());
        lorry.add(getNumber_plate());
        lorry.add(getModel_number());
        lorry.add(getFuel());
        lorry.add(getNumber_of_wheels());
        lorry.add(getEngin().getEmginNumber());
        lorry.add(getEngin().getNumber_of_stroke());
        lorry.add(getSafety());
        return lorry;
    }
}
