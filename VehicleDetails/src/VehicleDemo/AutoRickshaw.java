package VehicleDemo;

public class AutoRickshaw extends LightVehicle {
    private final String number_of_wheels="3";
    private String fuel;
    private String safety;
    private String vehicle;

    public AutoRickshaw(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel, String safety) {
        super(number_plate, model_number, engin, number_of_wheels,fuel);
        this.fuel=fuel;
        vehicle="AutoRickshaw";
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
    public void drive(AutoRickshaw autoRickshaw)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+autoRickshaw.getEngin().getNumber_of_stroke()+" Stroke");
    }
    public void printById(AutoRickshaw autoRickshaw)
    {
        System.out.println("Vehicle Type : " + autoRickshaw.getVehicle_type() + "\n" +
                "Vehicle : " + autoRickshaw.getVehicle() + "\n" +
                "NumberPlate : " + autoRickshaw.getNumber_plate() + "\n" +
                "ModelNumber : " + autoRickshaw.getModel_number() + "\n" +
                "Fuel : " + autoRickshaw.getFuel() + "\n" +
                "NoOfWheels : " + autoRickshaw.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + autoRickshaw.getEngin().getEnginNumber() + ", Stroke - " + autoRickshaw.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + autoRickshaw.getSafety() + "");
    }
    public void printItemOfVehicle(AutoRickshaw autoRickshaw, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + autoRickshaw.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + autoRickshaw.getVehicle());
            case 3 -> System.out.println("Model Number : " + autoRickshaw.getModel_number());
            case 4 -> System.out.println("Fuel : " + autoRickshaw.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + autoRickshaw.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + autoRickshaw.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + autoRickshaw.getSafety());
            default -> System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(AutoRickshaw autoRickshaw)
    {

        System.out.println(autoRickshaw.getVehicle_type() +" "+ autoRickshaw.getVehicle() +"   "+
                autoRickshaw.getNumber_plate() +"  "+
                autoRickshaw.getModel_number() +"   "+
                autoRickshaw.getFuel() +"   "+
                autoRickshaw.getNumber_of_wheels()+"   "+
                autoRickshaw.getEngin().getEnginNumber() +"  "+  autoRickshaw.getEngin().getNumber_of_stroke() +"  "+
                autoRickshaw.getSafety());
    }
}
