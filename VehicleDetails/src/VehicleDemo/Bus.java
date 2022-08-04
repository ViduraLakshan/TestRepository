package VehicleDemo;

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
    public void drive(Bus bus)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+bus.getEngin().getNumber_of_stroke()+" Stroke");
    }
    public void printById(Bus bus)
    {
        System.out.println("Vehicle Type : " + bus.getVehicle_type() + "\n" +
                "Vehicle : " + bus.getVehicle() + "\n" +
                "NumberPlate : " + bus.getNumber_plate() + "\n" +
                "ModelNumber : " + bus.getModel_number() + "\n" +
                "Fuel : " + bus.getFuel() + "\n" +
                "NoOfWheels : " + bus.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + bus.getEngin().getEnginNumber() + ", Stroke - " + bus.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + bus.getSafety() + "");
    }
    public void printItemOfVehicle(Bus bus, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + bus.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + bus.getVehicle());
            case 3 -> System.out.println("Model Number : " + bus.getModel_number());
            case 4 -> System.out.println("Fuel : " + bus.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + bus.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + bus.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + bus.getSafety());
            default -> System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(Bus bus)
    {

        System.out.println(bus.getVehicle_type() +" "+ bus.getVehicle() +"   "+
                bus.getNumber_plate() +"  "+
                bus.getModel_number() +"   "+
                bus.getFuel() +"   "+
                bus.getNumber_of_wheels()+"   "+
                bus.getEngin().getEnginNumber() +"  "+  bus.getEngin().getNumber_of_stroke() +"  "+
                bus.getSafety());
    }
}
