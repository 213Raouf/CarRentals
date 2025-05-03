//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;
import java.util.Scanner;

public class AddVehicleMethods {
	static Scanner keyboard = new Scanner(System.in);
    static String make;
    static String model;
    static int yearOfProduction;

    static void addVehicle() {
		int addVehicleAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					------------------------
					Add a Vehicle
					------------------------
					Vehicle Type:
						1.Electric Truck
						2.Diesel Truck
						3.Electric Car
						4.Gasoil Car
						5.Back
					Enter your choice: """);
			addVehicleAction = keyboard.nextInt();
			keyboard.nextLine();
			
			//Create a switch to execute what the user entered
			switch(addVehicleAction) {
			
				//Add a an Electric Truck
				case 1:{
					VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount] =addElectricTruck();
					System.out.println("The car number is "+ VehicleInventoryTrack.vehicleCount +" and the plate number is " + VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount++].getPlateNumber()) ;
					break;
				}
				
				// Add a diesel truck
				case 2:{
					VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount] =addDieselTruck();
					System.out.println("The car number is "+ VehicleInventoryTrack.vehicleCount +" and the plate number is " + VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount++].getPlateNumber());
					break;
				}
				
				//Add an electric car
				case 3:{
					VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount] =addElectricCar();
					System.out.println("The car number is "+ VehicleInventoryTrack.vehicleCount +" and the plate number is " + VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount++].getPlateNumber());
					break;
				}
				//Add a gasoil car 			
				case 4:{
					VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount] =addGasoilCar();
					System.out.println("The car number is "+ VehicleInventoryTrack.vehicleCount +" and the plate number is " + VehicleInventoryTrack.vehicleInventory[VehicleInventoryTrack.vehicleCount++].getPlateNumber());
					break;
				}
				
				//Back
				case 5:{
					break;
				}
				default:{
					System.out.println("Your input is invalid,please try again.");
					break;
				}
			
			}
		}while(addVehicleAction != 5);
	}
    
    private static void baseParametersInput() {
        System.out.print("Please enter the brand of your vehicle: ");
        make = keyboard.nextLine();

        System.out.print("Please enter the model of your vehicle: ");
        model = keyboard.nextLine();

        System.out.print("Please enter the year of production of your vehicle: ");
        yearOfProduction = keyboard.nextInt();
    }

    private static ElectricTruck addElectricTruck() {
        baseParametersInput();
        System.out.print("Please enter the max autonomy of your vehicle(km): ");
        double maxAutonomy = keyboard.nextDouble();
        System.out.print("Please enter the max capacity of your vehicle(kg): ");
        int maxCapacity = keyboard.nextInt();
        return new ElectricTruck(make, model, yearOfProduction,maxCapacity,maxAutonomy);
    }
    
    private static DieselTruck addDieselTruck() {
        baseParametersInput();
        System.out.print("Please enter the tank capacity of your vehicle(L): ");
        double tankCapacity = keyboard.nextDouble();
        System.out.print("Please enter the max capacity of your vehicle(kg): ");
        int maxCapacity = keyboard.nextInt();
        return new DieselTruck(make, model, yearOfProduction,maxCapacity,tankCapacity);
    }
    
    private static ElectricCar addElectricCar() {
        baseParametersInput();
        System.out.print("Please enter the max autonomy of your vehicle(km): ");
        double maxAutonomy = keyboard.nextDouble();
        System.out.print("Please enter the max number of passengers of your vehicle: ");
        int maxPassengers = keyboard.nextInt();
        return new ElectricCar(make, model, yearOfProduction,maxPassengers,maxAutonomy);
    }
    
    private static GasolineCar addGasoilCar() {
        baseParametersInput();
        System.out.print("Please enter the max number of passengers of your vehicle: ");
        int maxPassengers = keyboard.nextInt();
        return new GasolineCar(make, model, yearOfProduction,maxPassengers);
    }
}
