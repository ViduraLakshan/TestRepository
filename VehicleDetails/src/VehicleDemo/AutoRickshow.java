package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class AutoRickshow extends LightVehicle {
    private final String number_of_wheels="3";
    private String fuel;
    private String safety;
    private String vehicle;

    public AutoRickshow(String number_plate, String model_number, Engin engin, String number_of_wheels,String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels,fuel);
        this.fuel=fuel;
        vehicle="AutoRickshow";
    }

    @Override
    public String getNumber_of_wheels() {
        return number_of_wheels;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getVehicle() {
        return vehicle;
    }
    public List<String> getVehicleDetails()
    {
        List<String>autoRickshaw=new ArrayList<>();
        autoRickshaw.add(getVehicle_type());
        autoRickshaw.add(getVehicle());
        autoRickshaw.add(getNumber_plate());
        autoRickshaw.add(getModel_number());
        autoRickshaw.add(getFuel());
        autoRickshaw.add(getNumber_of_wheels());
        autoRickshaw.add(getEngin().getEmginNumber());
        autoRickshaw.add(getEngin().getNumber_of_stroke());
        autoRickshaw.add(getSafety());
        return autoRickshaw;
    }
}
