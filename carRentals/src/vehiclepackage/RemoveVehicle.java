//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

import java.util.Scanner;

public class RemoveVehicle {

	static void removeVehicle() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the plate number of the vehicle you want to remove: ");
		String plateNumberStr = keyboard.nextLine();		
		for(int i =0; i<VehicleInventoryTrack.vehicleInventory.length;i++) {
			if(VehicleInventoryTrack.vehicleInventory[i]!= null && VehicleInventoryTrack.vehicleInventory[i]
					.getPlateNumber().equalsIgnoreCase(plateNumberStr)) {
				VehicleInventoryTrack.vehicleInventory[i]=null;
				System.out.println("Your vehicle have been removed successfully!");
				return;
			}
		}
		System.out.println("Vehicle with plate number " + plateNumberStr + "not found.");
		
	}
	
}
