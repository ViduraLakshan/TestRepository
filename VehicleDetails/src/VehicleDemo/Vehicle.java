package VehicleDemo;

public class Vehicle {

    private String number_plate;
    private String model_number;
    private Engin engin;
    private String number_of_wheels;



    public Vehicle(String number_plate, String model_number, Engin engin, String number_of_wheels) {

        this.number_plate = number_plate;
        this.model_number = model_number;
        this.engin = engin;
        this.number_of_wheels = number_of_wheels;

    }
    public Vehicle()
    {

    }

    public String getNumber_plate() {
        return number_plate;
    }

    public String getModel_number() {
        return model_number;
    }

    public Engin getEngin() {
        return engin;
    }

    public String getNumber_of_wheels() {
        return number_of_wheels;
    }


    public void drive()
    {

    }
}
