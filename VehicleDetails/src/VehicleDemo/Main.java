package VehicleDemo;

import java.lang.reflect.GenericArrayType;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static HashMap<String, List> vehicles = new HashMap<>();
    static List<MotorBike> motorBikesList = new ArrayList<>();
    static List<AutoRickshow> autoRickshawsList = new ArrayList<>();
    static List<Car> carsList = new ArrayList<>();
    static List<Bus> busesList = new ArrayList<>();
    static List<Lorry> lorriesList = new ArrayList<>();
    static List<Truck> trucksList = new ArrayList<>();
    static HashMap<String,Vehicle> vehicleList=new HashMap<>();
    public static void printVehicle(String number_plate) {
        List ob = vehicles.get(number_plate);

        MotorBike ob1 = (MotorBike) vehicleList.get(number_plate);
        ob1.getVehicleDetails();

        System.out.println("Vehicle Type : " + ob.get(0) + "\n" +
                "Vehicle : " + ob.get(1) + "\n" +
                "NumberPlate : " + ob.get(2) + "\n" +
                "ModelNumber : " + ob.get(3) + "\n" +
                "Fuel : " + ob.get(4) + "\n" +
                "NoOfWheels : " + ob.get(5) + "\n" +
                "Engine : EngineNo - " + ob.get(6) + ", Stroke - " + ob.get(7) + "\n" +
                "Safety. : " + ob.get(8) + "");

    }

    public static void printItemOfVehicle(String numberPlate, String sNumber) {
        List ob = vehicles.get(numberPlate);
        int number = Integer.parseInt(sNumber);
        switch (number) {
            case 1 -> System.out.println("Vehicle Type : " + ob.get(0));
            case 2 -> System.out.println("Vehicle : " + ob.get(1));
            case 3 -> System.out.println("Model Number : " + ob.get(3));
            case 4 -> System.out.println("Fuel : " + ob.get(4));
            case 5 -> System.out.println("Number of Wheels : " + ob.get(5));
            case 6 -> System.out.println("Engine : " + ob.get(6));
            case 7 -> System.out.println("Safety : " + ob.get(8));
            default -> {
                System.out.println("Invalid Number");
            }
        }
    }

    public static void printAllVehicleByType(String vehicle) {
        if (vehicle.equals("Bike") || vehicle.equals("bike")) {
            for (MotorBike details : motorBikesList) {
                System.out.println(details.getVehicleDetails());
            }
        } else if (vehicle.equals("Auto") || vehicle.equals("auto")) {
            for (AutoRickshow details : autoRickshawsList) {
                System.out.println(details.getVehicleDetails());
            }
        } else if (vehicle.equals("Car") || vehicle.equals("car")) {
            for (Car details : carsList) {
                System.out.println(details.getVehicleDetails());
            }
        } else if (vehicle.equals("Bus") || vehicle.equals("bus")) {
            for (Bus details : busesList) {
                System.out.println(details.getVehicleDetails());
            }
        } else if (vehicle.equals("Lorry") || vehicle.equals("lorry")) {
            for (Lorry details : lorriesList) {
                System.out.println(details.getVehicleDetails());
            }
        } else if (vehicle.equals("Truck") || vehicle.equals("truck")) {
            for (Truck details : trucksList) {
                System.out.println(details.getVehicleDetails());
            }
        } else {
            System.out.println("Vehicle not found !");
        }

    }

    public static void drive(String numberPlate) {
        List ob = vehicles.get(numberPlate);

        System.out.println("You are driving " + ob.get(4) + " Engine " + ob.get(1) + " with " + ob.get(7) + " Stroke");

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

    public static boolean checkHelmet(String helmet,String vehicleType) {

        if (helmet.equals("Helmet") == vehicleType.equals("T") == vehicleType.equals("L") == vehicleType.equals("B") == vehicleType.equals("C") != vehicleType.equals("A")) {
            return true;
        }else
        {
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

            String vehicle=array[0];
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
                if (array[0].equals("M") && checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    MotorBike motorBike = new MotorBike(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(motorBike.getNumber_plate(), motorBike.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    motorBikesList.add(motorBike);
                    vehicleList.put(motorBike.getNumber_plate(),motorBike);
                    printVehicle(motorBike.getNumber_plate());

                } else if (vehicle.equals("A")&&checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    AutoRickshow autoRickshow = new AutoRickshow(numberPlate, modelNumber, engin, "3", fuel, safety);
                    vehicles.put(autoRickshow.getNumber_plate(), autoRickshow.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    autoRickshawsList.add(autoRickshow);
                    printVehicle(autoRickshow.getNumber_plate());

                } else if (vehicle.equals("C")&&checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Car car = new Car(numberPlate, modelNumber, engin, "4", fuel, safety);
                    vehicles.put(car.getNumber_plate(), car.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    carsList.add(car);
                    printVehicle(car.getNumber_plate());

                } else if (vehicle.equals("B") && checkFuel(fuel)&&checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Bus bus = new Bus(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(bus.getNumber_plate(), bus.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    busesList.add(bus);
                    printVehicle(bus.getNumber_plate());

                } else if (vehicle.equals("L") && checkFuel(fuel)&&checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Lorry lorry = new Lorry(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(lorry.getNumber_plate(), lorry.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    lorriesList.add(lorry);
                    printVehicle(lorry.getNumber_plate());

                } else if (vehicle.equals("T") && checkFuel(fuel)&&checkHelmet(safety,vehicle)) {
                    Engin engin = new Engin(engineNumber, numberOfStroke);
                    Truck truck = new Truck(numberPlate, modelNumber, engin, "2", fuel, safety);
                    vehicles.put(truck.getNumber_plate(), truck.getVehicleDetails());
                    System.out.println("Vehicle Add Successfully");
                    trucksList.add(truck);
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
