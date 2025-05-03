//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;
import java.util.Scanner;

public class VehicleManagement {
	
	static Scanner keyboard = new Scanner(System.in);
	
    public static void vehicleManagement(){
		int vehicleAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Vehicle Management Menu:
						1.Add a Vehicle
						2.Delete a Vehicle
						3.Update a Vehicle information
						4.List all vehicles by category (electric trucks, diesel trucks, etc.) 
						5.Back
					Enter your choice: """);
			vehicleAction = keyboard.nextInt();
			
			//Create a switch to execute what the user entered
			switch(vehicleAction) {
			
				//Add a Vehicle
				case 1:{
					AddVehicleMethods.addVehicle();
					break;
				}
				
				// Delete a vehicle 
				case 2:{
					RemoveVehicle.removeVehicle();
					break;
				}
				
				//Update a vehicle information

				case 3:{
					UpdateVehicleInfo.updateVehicleInfo();
					break;
				}
				//List all vehicles by category (electric trucks, diesel trucks, etc.) 			
				case 4:{
					ListVehiclesByCategory.listVehiclesBycategory();
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
		}while(vehicleAction != 5);
	}
	
	
}
