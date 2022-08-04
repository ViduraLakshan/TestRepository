package VehicleDemo;


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
    public void drive(Car car)
    {
        System.out.println("You are driving "+fuel+" Engine "+vehicle+" with "+car.getEngin().getNumber_of_stroke()+" Stroke");
    }
    public void printById(Car car)
    {
        System.out.println("Vehicle Type : " + car.getVehicle_type() + "\n" +
                "Vehicle : " + car.getVehicle() + "\n" +
                "NumberPlate : " + car.getNumber_plate() + "\n" +
                "ModelNumber : " + car.getModel_number() + "\n" +
                "Fuel : " + car.getFuel() + "\n" +
                "NoOfWheels : " + car.getNumber_of_wheels()+ "\n" +
                "Engine : EngineNo - " + car.getEngin().getEnginNumber() + ", Stroke - " + car.getEngin().getNumber_of_stroke() + "\n" +
                "Safety. : " + car.getSafety() + "");
    }
    public void printItemOfVehicle(Car car, String sNumber) {

        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + car.getVehicle_type());
            case 2 -> System.out.println("Vehicle : " + car.getVehicle());
            case 3 -> System.out.println("Model Number : " + car.getModel_number());
            case 4 -> System.out.println("Fuel : " + car.getFuel());
            case 5 -> System.out.println("Number of Wheels : " + car.getNumber_of_wheels());
            case 6 -> System.out.println("Engine : " + car.getEngin().getEnginNumber());
            case 7 -> System.out.println("Safety : " + car.getSafety());
            default -> System.out.println("Invalid Number");
        }
    }
    public void PrintAllBike(Car car)
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
