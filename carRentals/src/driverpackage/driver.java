//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package driverpackage;
import java.util.Scanner;
import clientpackage.*;
import vehiclepackage.*;

public class driver {
		
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Do you want to access the menu(1) or run a predefined scenario(2).");
		int menuChoice = keyboard.nextInt();
		
		if(menuChoice == 1 ) {
		int executeAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Managment Menu:
						1.Vehicle Management
						2.Client Management
						3.Leasing Management
						4.Additional Operations
						5.Exit
					Enter your choice: """);
			executeAction = keyboard.nextInt();
			
			//Create a switch to execute what the user entered
			switch(executeAction) {
			
				//Display Vehicle Management options
				case 1:{
					VehicleManagement.vehicleManagement();
					break;
				}
				
				//Display Client Management options
				case 2:{
					ClientManagement.clientManagement();
					break;
				}
				
				//Display Leasing operations 
				case 3:{
					LeasingOperations.leasingOperations();
					break;
				}
				//Display Additional Operations
				case 4:{
					AditionalOperations.aditionalOperations();
					break;
				}
				
				//Exit
				case 5:{
					break;
				}
				default:{
					System.out.println("Your input is invalid,please try again.");
					break;
				}
			
			}
		}while(executeAction != 5);
		}
		else if(menuChoice==2) {
			DieselTruck dt1 = new DieselTruck("Naps","okey",10,25,50);
			DieselTruck dt2 = new DieselTruck("riyad","aa",10,25,50);
			DieselTruck dt3 = new DieselTruck("mahrez","22",10,25,50);
			GasolineCar gc1 = new GasolineCar("Naps","okey",22,1000);
			GasolineCar gc2 = new GasolineCar("riyad","aa",25,510);
			GasolineCar gc3 = new GasolineCar("mahrez","22",120,50);
			ElectricCar ec1 = new ElectricCar("Naps","okey",22,1000,123.1);
			ElectricCar ec2 = new ElectricCar("Naps","okey",22,1000,123.1);
			ElectricCar ec3 = new ElectricCar("mahrez","22",120,50,504.12);
			ElectricTruck et1 = new ElectricTruck("Naps","okey",232,34,433.12);
			ElectricTruck et2 = new ElectricTruck("riyad","aa",2435,12,1121.23);
			ElectricTruck et3 = new ElectricTruck("mahrez","22",819,50,628.13);
			Client cl1 = new Client("ryan","mahrez","leic");
			Client cl2 = new Client("raouf","ouai","154 rue v");
			Client cl3 = new Client("zak","zbi","domon");
			
	        System.out.println(dt1);
	        System.out.println(dt2);
	        System.out.println(dt3);
	        
	        System.out.println(gc1);
	        System.out.println(gc2);
	        System.out.println(gc3);
	        
	        System.out.println(ec1);
	        System.out.println(ec2);
	        System.out.println(ec3);
	        
	        System.out.println(et1);
	        System.out.println(et2);
	        System.out.println(et3);
			
	        //two different classes
	        System.out.println(dt1.equals(gc2));
	        //same classes same attributes
	        System.out.println(ec1.equals(ec2));
	        //same classes diff attributes
	        System.out.println(ec1.equals(ec3));

	        DieselTruck[] dieselTruckArray = {dt1,dt2,dt3};
	        GasolineCar[] gasolineCarArray = {gc1,gc2,gc3};
	        ElectricCar[] electricCarArray = {ec1,ec2,ec3};
	        ElectricTruck[] electricTruckArray = {et1,et2,et3};
	        
	        for(int i =0;i<dieselTruckArray.length;i++) {
	        	VehicleInventoryTrack.vehicleInventory[i] = dieselTruckArray[i];
	        }
	        findTruckLargestCapacity();
			copyVehicles(electricTruckArray);

		}
		
}
	
	public static DieselTruck findTruckLargestCapacity() {
        int truckNumber = -1;

        for (int i = 0; i < VehicleInventoryTrack.vehicleCount; i++) {
            if (VehicleInventoryTrack.vehicleInventory[i] != null && VehicleInventoryTrack.vehicleInventory[i] instanceof DieselTruck) {
                if (truckNumber == -1 || ((DieselTruck) VehicleInventoryTrack.vehicleInventory[i]).getMaxCapacity() > 
                ((DieselTruck) VehicleInventoryTrack.vehicleInventory[truckNumber]).getMaxCapacity()) {
                    truckNumber = i;
                }
            }
        }


        // Return a new object based on the truck type
        if(truckNumber ==-1) 
        	return null;
        else 
            return new DieselTruck((DieselTruck) VehicleInventoryTrack.vehicleInventory[truckNumber]);
        
        
    }
    public static ElectricTruck[] copyVehicles(ElectricTruck[] electricTrucksArray) {
    			ElectricTruck[] electricTrucksCopyArray = new ElectricTruck[electricTrucksArray.length];
    	    	for(int i =0;i<electricTrucksArray.length;i++) {
    	    		electricTrucksCopyArray[i] = new ElectricTruck(electricTrucksArray[i]);
    	    	}
    	    	return electricTrucksCopyArray;
    }    	

	}



