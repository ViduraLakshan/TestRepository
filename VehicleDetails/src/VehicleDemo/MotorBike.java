package VehicleDemo;

import java.util.ArrayList;
import java.util.List;

public class MotorBike extends LightVehicle {
    private final String number_of_wheels="2";
    private final String fuel="Petrol";
    private final String safety ="helmet";
    private final String vehicle;

    public MotorBike(String number_plate, String model_number, Engin engin, String number_of_wheels,String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels,fuel);

        vehicle="Bike";
    }

    @Override
    public String getNumber_of_wheels() {
        return number_of_wheels;
    }

    public String getFuel() {
        return fuel;
    }


    public String getSafety() {
        return safety;
    }


    public String getVehicle() {
        return vehicle;
    }
    public void drive()
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+" Stroke");
    }
    public List<String> getVehicleDetails()
    {
        List<String>motorBike=new ArrayList<>();
        motorBike.add(getVehicle_type());
        motorBike.add(getVehicle());
        motorBike.add(getNumber_plate());
        motorBike.add(getModel_number());
        motorBike.add(getFuel());
        motorBike.add(getNumber_of_wheels());
        motorBike.add(getEngin().getEmginNumber());
        motorBike.add(getEngin().getNumber_of_stroke());
        motorBike.add(getSafety());
        return motorBike;
    }
}
