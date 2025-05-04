//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;

import java.util.Scanner;

import vehiclepackage.VehicleInventoryTrack;

public class LeasingOperations {	
    public static void leasingOperations(){
    	Scanner keyboard = new Scanner(System.in);
		int clientAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Vehicle Management Menu:
						1.Lease a vehicle
						2.Return a vehicle
						3.Show all vehicles leased by a client	
						4.Show all leased vehicles
						5.Back
					Enter your choice: """);
			clientAction = keyboard.nextInt();
			
			//Create a switch to execute what the user entered
			switch(clientAction) {
			
				//Lease a vehicle
				case 1:{
			    	System.out.println("Please enter the client number: ");
			    	int clientNumber = keyboard.nextInt();
			    	System.out.println("Please enter the vehicle's number: ");
			    	int vehicleNumber = keyboard.nextInt();
			    	ClientsList.clientsList[clientNumber].leaseVehicle(VehicleInventoryTrack.vehicleInventory[vehicleNumber]);
					break;
				}
				
				// Return a vehicle 
				case 2:{
					System.out.println("Please enter the client number: ");
			    	int clientNumber = keyboard.nextInt();
			    	System.out.println("Please enter the client vehicle's number you want to return: ");
			    	int vehicleNumber = keyboard.nextInt();
			    	ClientsList.clientsList[clientNumber].returnVehicle(ClientsList.clientsList[clientNumber].vehiclesArray[vehicleNumber]);
					break;
				}
				
				//Show all leased vehicles by client

				case 3:{
					System.out.println("Please enter the client number: ");
			    	int clientNumber = keyboard.nextInt();
			    	ClientsList.clientsList[clientNumber].showClientsVehicles();
					break;
				}
				
				//Show all leased vehicles
				case 4:{
					VehicleInventoryTrack.showAllLeasedVehicles();
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
		}while(clientAction != 5);
	}
	
	
}

