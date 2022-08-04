package VehicleDemo;

public class Truck extends HeavyVehicle{
    private final String number_of_wheels="6";
    private String fuel;
    private String safety;
    private String vehicle;
    public Truck(String number_plate, String model_number, Engin engin, String number_of_wheels, String fuel,String safety) {
        super(number_plate, model_number, engin, number_of_wheels, fuel);
        this.safety=safety;
        this.fuel=fuel;
        vehicle="Truck";
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
    public void drive(Truck truck)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+truck.getEngin().getNumber_of_stroke()+" Stroke");
    }
    public void printById(Truck truck)
    {
        System.out.println("Vehicle Type : " + truck.getVehicle_type() + "\n" +
                "Vehicle : " + truck.getVehicle() + "\n" +
                "NumberPlate : " + truck.getNumber_plate() + "\n" +
                "ModelNumber : " + truck.getModel_number() + "\n" +
                "Fuel : " + truck.getFuel() + "\n" +
                "NoOfWheels : " + truck.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + truck.getEngin().getEnginNumber() + ", Stroke - " + truck.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + truck.getSafety() + "");
    }
    public void printItemOfVehicle(Truck truck, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + truck.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + truck.getVehicle());
            case 3 -> System.out.println("Model Number : " + truck.getModel_number());
            case 4 -> System.out.println("Fuel : " + truck.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + truck.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + truck.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + truck.getSafety());
            default -> System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(Truck car)
    {

        System.out.println(car.getVehicle_type() +" "+ car.getVehicle() +"   "+
                car.getNumber_plate() +"  "+
                car.getModel_number() +"   "+
                car.getFuel() +"   "+
                car.getNumber_of_wheels()+"   "+
                car.getEngin().getEnginNumber() +"  "+  car.getEngin().getNumber_of_stroke() +"  "+
                car.getSafety());
    }
}
