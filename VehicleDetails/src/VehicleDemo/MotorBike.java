package VehicleDemo;

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
    public void drive(MotorBike motorBike)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+motorBike.getEngin().getNumber_of_stroke()+" Stroke");
    }

    public void printById(MotorBike motorBike)
    {
        System.out.println("Vehicle Type : " + motorBike.getVehicle_type() + "\n" +
                "Vehicle : " + motorBike.getVehicle() + "\n" +
                "NumberPlate : " + motorBike.getNumber_plate() + "\n" +
                "ModelNumber : " + motorBike.getModel_number() + "\n" +
                "Fuel : " + motorBike.getFuel() + "\n" +
                "NoOfWheels : " + motorBike.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + motorBike.getEngin().getEnginNumber() + ", Stroke - " + motorBike.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + motorBike.getSafety() + "");
    }
    public void printItemOfVehicle(MotorBike motorBike, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + motorBike.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + motorBike.getVehicle());
            case 3 -> System.out.println("Model Number : " + motorBike.getModel_number());
            case 4 -> System.out.println("Fuel : " + motorBike.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + motorBike.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + motorBike.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + motorBike.getSafety());
            default ->System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(MotorBike motorBike)
    {

        System.out.println(motorBike.getVehicle_type() +" "+ motorBike.getVehicle() +"   "+
                  motorBike.getNumber_plate() +"  "+
                motorBike.getModel_number() +"   "+
                motorBike.getFuel() +"   "+
                 motorBike.getNumber_of_wheels()+"   "+
                 motorBike.getEngin().getEnginNumber() +"  "+  motorBike.getEngin().getNumber_of_stroke() +"  "+
                 motorBike.getSafety());
    }
}
