package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class Car extends LightVehicle{
    private final String number_of_wheels="4";
    private String fuel;
    private String safety;
    private String vehicle;
    public Car(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels, fuel);
        this.safety=safety;
        vehicle="Car";
        this.fuel=fuel;
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
        List<String>car=new ArrayList<>();
        car.add(getVehicle_type());
        car.add(getVehicle());
        car.add(getNumber_plate());
        car.add(getModel_number());
        car.add(getFuel());
        car.add(getNumber_of_wheels());
        car.add(getEngin().getEmginNumber());
        car.add(getEngin().getNumber_of_stroke());
        car.add(getSafety());
        return car;
    }
}
