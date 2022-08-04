package VehicleDemo;

import java.util.*;

public class Main {

    static HashMap<String, Vehicle> vehicles = new HashMap<>();

    public static void printVehicle(String number_plate) {

        Vehicle vehicle = vehicles.get(number_plate);
        if (vehicle instanceof MotorBike) {
            MotorBike motorBike = (MotorBike) vehicles.get(number_plate);
            motorBike.printById(motorBike);
        } else if (vehicle instanceof AutoRickshaw) {
            AutoRickshaw autoRickshaw = (AutoRickshaw) vehicles.get(number_plate);
            autoRickshaw.printById(autoRickshaw);
        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicles.get(number_plate);
            car.printById(car);
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicles.get(number_plate);
            bus.printById(bus);
        } else if (vehicle instanceof Lorry) {
            Lorry lorry = (Lorry) vehicles.get(number_plate);
            lorry.printById(lorry);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicles.get(number_plate);
            truck.printById(truck);
        } else {
            System.out.println("This Vehicle is not Available ! ");
        }
    }

    public static void printItemOfVehicle(String numberPlate, String sNumber) {
        Vehicle vehicle = vehicles.get(numberPlate);
        if (vehicle instanceof MotorBike) {

            MotorBike motorBike = (MotorBike) vehicles.get(numberPlate);
            motorBike.printItemOfVehicle(motorBike, sNumber);
        } else if (vehicle instanceof AutoRickshaw) {
            AutoRickshaw autoRickshaw = (AutoRickshaw) vehicles.get(numberPlate);
            autoRickshaw.printItemOfVehicle(autoRickshaw, sNumber);
        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicles.get(numberPlate);
            car.printItemOfVehicle(car, sNumber);
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicles.get(numberPlate);
            bus.printItemOfVehicle(bus, sNumber);
        } else if (vehicle instanceof Lorry) {
            Lorry lorry = (Lorry) vehicles.get(numberPlate);
            lorry.printItemOfVehicle(lorry, sNumber);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicles.get(numberPlate);
            truck.printItemOfVehicle(truck, sNumber);
        } else {
            System.out.println("This Vehicle is not Available ! ");
        }
    }

    public static void drive(String numberPlate) {
        Vehicle vehicle = vehicles.get(numberPlate);
        if (vehicle instanceof MotorBike) {
            MotorBike motorBike = (MotorBike) vehicles.get(numberPlate);
            motorBike.drive(motorBike);
        } else if (vehicle instanceof AutoRickshaw) {
            AutoRickshaw autoRickshaw = (AutoRickshaw) vehicles.get(numberPlate);
            autoRickshaw.drive(autoRickshaw);
        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicles.get(numberPlate);
            car.drive(car);
        } else if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicles.get(numberPlate);
            bus.drive(bus);
        } else if (vehicle instanceof Lorry) {
            Lorry lorry = (Lorry) vehicles.get(numberPlate);
            lorry.drive(lorry);
        } else if (vehicle instanceof Truck) {
            Truck truck = (Truck) vehicles.get(numberPlate);
            truck.drive(truck);
        } else {
            System.out.println("This Vehicle is not Available ! ");
        }
    }

    public static void printAllVehicleByType(String vehicleType) {



        if (vehicleType.equals("Bike") || vehicleType.equals("bike")) {

            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof MotorBike)
                {
                    MotorBike motorBike= (MotorBike) vehicles.get(key);
                    motorBike.PrintAllBike(motorBike);
                }
            }

        } else if (vehicleType.equals("Auto") || vehicleType.equals("auto")) {
            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof AutoRickshaw)
                {
                    AutoRickshaw autoRickshaw= (AutoRickshaw) vehicles.get(key);
                    autoRickshaw.PrintAllBike(autoRickshaw);
                }
            }
        } else if (vehicleType.equals("Car") || vehicleType.equals("car")) {
            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof Car)
                {
                    Car car= (Car) vehicles.get(key);
                    car.PrintAllBike(car);
                }
            }
        } else if (vehicleType.equals("Bus") || vehicleType.equals("bus")) {
            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof Bus)
                {
                    Bus bus= (Bus) vehicles.get(key);
                    bus.PrintAllBike(bus);
                }
            }
        } else if (vehicleType.equals("Lorry") || vehicleType.equals("lorry")) {
            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof Lorry)
                {
                    Lorry lorry= (Lorry) vehicles.get(key);
                    lorry.PrintAllBike(lorry);
                }
            }
        } else if (vehicleType.equals("Truck") || vehicleType.equals("truck")) {
            for (String key: vehicles.keySet()) {
                if(vehicles.get(key) instanceof Truck)
                {
                    Truck truck= (Truck) vehicles.get(key);
                    truck.PrintAllBike(truck);
                }
            }
        } else {
            System.out.println("Vehicle not found !");
        }

    }


    public static void deleteVehicle(String numberPlate) {
        System.out.println("Vehicle Deleted successfully");
        printVehicle(numberPlate);
        vehicles.remove(numberPlate);
    }

    public static boolean checkNumberPlate(String numberPlate) {
        if (numberPlate.length() == 7) {
            return true;
        } else {
            System.out.println("Number Plate Should be 7 digit");
            return false;
        }
    }

    public static boolean checkVehicleAlreadyExists(String numberPlate) {
        if (vehicles.containsKey(numberPlate)) {
            System.out.println("This Vehicle already Exists ! ");
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkVehicleAvailable(String numberPlate) {
        if (vehicles.containsKey(numberPlate)) {
            return true;
        } else {
            System.out.println("This Vehicle is not Available ! ");
            return false;
        }
    }

    public static boolean checkModelNumber(String modelNumber) {
        if (modelNumber.length() >= 2 && modelNumber.length() <= 5) {
            return true;
        } else {
            System.out.println("Model Number Should be between 2 and 5 digit");
            return false;
        }
    }
    public static boolean checkFuel(String fuel) {
        try {
            if (Objects.equals(fuel, "Petrol")) {
                System.out.println("Heavy Vehicle can not Have Petrol");
                return false;
            } else if (Objects.equals(fuel, "Diesel")) {
                return true;
            } else {
                System.out.println("Invalid Input for Fuel");
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return true;
        }
    }
    public static boolean checkHelmet(String helmet, String vehicleType) {

        if (helmet.equals("Helmet") == vehicleType.equals("T") == vehicleType.equals("L") == vehicleType.equals("B") == vehicleType.equals("C") != vehicleType.equals("A")) {
            return true;
        } else {
            System.out.println("Bike only support Helmet");
            return false;
        }
    }

    public static boolean checkStroke(String stroke) {
        if (stroke.equals("2") || stroke.equals("4")) {
            return true;
        } else {
            System.out.println("Stroke Should be only 2 and 4 ");
            return false;
        }
    }

    public static void addVehicle(String[] array) {
        if (array.length == 7 || array.length == 5) {

            String vehicle = array[0];
            String numberPlate = array[1];
            String modelNumber = array[2];
            String engineNumber = array[3];
            String numberOfStroke = array[4];
            String fuel = "";
            String safety = "";
            if (array.length == 7) {
                if (array[5].equals("P")) {
                    fuel = "Petrol";
                } else if (array[5].equals("D")) {
                    fuel = "Diesel";
                } else {
                    System.out.println("Incorrect Fuel Type");
                }
                if (array[6].equals("H")) {
                    safety = "Helmet";
                } else if (array[6].equals("S")) {
                    safety = "SeatBelt";
                } else if (array[6].equals("A")) {
                    safety = "AirBag";
                } else {
                    System.out.println("Incorrect Safety Type");
                }

            } else {
                if (vehicle.equals("A") || vehicle.equals("M") || vehicle.equals("C")) {
                    fuel = "Petrol";
                } else {
                    fuel = "Diesel";
                    safety = "SeatBelt";
                }
                if (vehicle.equals("C")) {
                    safety = "SeatBelt";
                }
                if (vehicle.equals("M")) {
                    safety = "Helmet";
                }
            }
            if (checkNumberPlate(numberPlate) && checkModelNumber(modelNumber) && checkStroke(numberOfStroke) && checkVehicleAlreadyExists(numberPlate)) {
                if (array[0].equals("M") && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    MotorBike motorBike = new MotorBike(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(motorBike.getNumber_plate(), motorBike);
                    System.out.println("Vehicle Add Successfully");


                    motorBike.printById(motorBike);

                } else if (vehicle.equals("A") && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    AutoRickshaw autoRickshaw = new AutoRickshaw(numberPlate, modelNumber, engin, "3", fuel, safety);
                    vehicles.put(autoRickshaw.getNumber_plate(), autoRickshaw);
                    System.out.println("Vehicle Add Successfully");
                    printVehicle(autoRickshaw.getNumber_plate());

                } else if (vehicle.equals("C") && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Car car = new Car(numberPlate, modelNumber, engin, "4", fuel, safety);
                    vehicles.put(car.getNumber_plate(), car);
                    System.out.println("Vehicle Add Successfully");
                    printVehicle(car.getNumber_plate());

                } else if (vehicle.equals("B") && checkFuel(fuel) && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Bus bus = new Bus(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(bus.getNumber_plate(), bus);
                    System.out.println("Vehicle Add Successfully");
                    printVehicle(bus.getNumber_plate());

                } else if (vehicle.equals("L") && checkFuel(fuel) && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Lorry lorry = new Lorry(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(lorry.getNumber_plate(), lorry);
                    System.out.println("Vehicle Add Successfully");
                    printVehicle(lorry.getNumber_plate());

                } else if (vehicle.equals("T") && checkFuel(fuel) && checkHelmet(safety, vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Truck truck = new Truck(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(truck.getNumber_plate(), truck);
                    System.out.println("Vehicle Add Successfully");
                    printVehicle(truck.getNumber_plate());

                } else {
                    System.out.println("Not valid Number");
                }
            }
        } else {
            System.out.println("invalid input !");
        }
    }

    public static void main(String[] args) {

        boolean condition = true;
        while (condition) {
            Scanner in = new Scanner(System.in);
            System.out.println("Select an action. insert action number and Enter");
            System.out.println("""
                    1. Add
                    2. Get
                    3. Drive\s
                    4. Delete\s
                    5. Find All Vehicle by Type
                    6. Exit\s""");
            String input = in.nextLine();
            if (input.equals("1")) {
                System.out.println("Insert Vehicle details :");
                String str = in.nextLine();
                String[] array = str.split(",");
                addVehicle(array);

            } else if (input.equals("2")) {
                System.out.println("""
                        Add number optionally to get particular attribute
                        1-Vehicle Type
                        2-Vehicle\s
                        3-ModelNumber
                        4-Fuel\s
                        5-NoOfWheels\s
                        6-Engine
                        7-Safety
                        Format : <NP>,<attribute>
                        Insert Number Plate :\s
                        """);
                String str = in.nextLine();
                String[] array = str.split(",");
                if (checkNumberPlate(array[0]) && array.length == 1 && checkVehicleAvailable(array[0])) {
                    printVehicle(array[0]);
                } else if (array.length == 2) {
                    printItemOfVehicle(array[0], array[1]);
                } else {
                    System.out.println("Invalid Input ");
                }

            } else if (input.equals("3")) {
                System.out.println("Enter Vehicle Number :");
                String numberPlate = in.nextLine();
                if (checkVehicleAvailable(numberPlate) && checkNumberPlate(numberPlate)) {
                    drive(numberPlate);
                }

            } else if (input.equals("4")) {
                System.out.println("Enter Vehicle Number :");
                String numberPlate = in.nextLine();
                if (checkNumberPlate(numberPlate) && checkVehicleAvailable(numberPlate)) {
                    deleteVehicle(numberPlate);
                }

            } else if (input.equals("5")) {
                System.out.println("Enter Vehicle");
                String vehicle = in.nextLine();
                printAllVehicleByType(vehicle);

            } else if (input.equals("6")) {
                System.out.println("Thank you Come Again.!");
                condition = false;
            } else {
                System.out.println("Not Valid Input");

            }
        }
    }
}
