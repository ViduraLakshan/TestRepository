package VehicleDemo;

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
    public void drive(Lorry lorry)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+lorry.getEngin().getNumber_of_stroke()+" Stroke");
    }
    public void printById(Lorry lorry)
    {
        System.out.println("Vehicle Type : " + lorry.getVehicle_type() + "\n" +
                "Vehicle : " + lorry.getVehicle() + "\n" +
                "NumberPlate : " + lorry.getNumber_plate() + "\n" +
                "ModelNumber : " + lorry.getModel_number() + "\n" +
                "Fuel : " + lorry.getFuel() + "\n" +
                "NoOfWheels : " + lorry.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + lorry.getEngin().getEnginNumber() + ", Stroke - " + lorry.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + lorry.getSafety() + "");
    }
    public void printItemOfVehicle(Lorry lorry, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + lorry.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + lorry.getVehicle());
            case 3 -> System.out.println("Model Number : " + lorry.getModel_number());
            case 4 -> System.out.println("Fuel : " + lorry.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + lorry.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + lorry.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + lorry.getSafety());
            default -> System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(Lorry lorry)
    {

        System.out.println(lorry.getVehicle_type() +" "+ lorry.getVehicle() +"   "+
                lorry.getNumber_plate() +"  "+
                lorry.getModel_number() +"   "+
                lorry.getFuel() +"   "+
                lorry.getNumber_of_wheels()+"   "+
                lorry.getEngin().getEnginNumber() +"  "+  lorry.getEngin().getNumber_of_stroke() +"  "+
                lorry.getSafety());
    }
}
