//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;
import java.util.*;

import driverpackage.driver;

public class AditionalOperations {
	static Scanner keyboard = new Scanner(System.in);
	public static void aditionalOperations() {
		int aditionalOperationAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Vehicle Type:
						1.Find truck with largest Capacity 
						2.Create copy electric trucks array
						3.Back
					Enter your choice: """);
			aditionalOperationAction = keyboard.nextInt();
			
			//Create a switch to execute what the user entered
			switch(aditionalOperationAction) {
			
				//Find truck with largest Capacity 
				case 1:{
					System.out.println(driver.findTruckLargestCapacity());
					break;
				}
				
				// Create copy electric trucks array
				case 2:{
					ElectricTruck[] electricTrucksArray = new ElectricTruck[VehicleInventoryTrack.vehicleCount];
					int electricTrucksArrayCount = 0;
					for(int i = 0; i<VehicleInventoryTrack.vehicleCount;i++) {
						if(VehicleInventoryTrack.vehicleInventory[i] instanceof ElectricTruck)
							electricTrucksArray[electricTrucksArrayCount++] = (ElectricTruck) VehicleInventoryTrack.vehicleInventory[i];
						driver.copyVehicles(electricTrucksArray);
					}
					break;
				}
				
				//Back
				case 3:{
					break;
				}
				
				default:{
					System.out.println("Your input is invalid,please try again.");
					break;
				}
			
			}
		}while(aditionalOperationAction != 3);
	}
	}

