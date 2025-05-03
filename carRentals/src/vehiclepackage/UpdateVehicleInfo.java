//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

import java.util.Scanner;

public class UpdateVehicleInfo {
	static Scanner keyboard = new Scanner(System.in);
	static int vehicleArrayPosition;
	
	static void updateVehicleInfo() {
		System.out.println("Enter the plate number of the vehicle you want to edit: ");
		String plateNumberStr = keyboard.nextLine();
		for(int i =0; i<VehicleInventoryTrack.vehicleInventory.length;i++) {
			if(VehicleInventoryTrack.vehicleInventory[i]!= null && VehicleInventoryTrack.vehicleInventory[i]
					.getPlateNumber().equalsIgnoreCase(plateNumberStr)) {
				if (VehicleInventoryTrack.vehicleInventory[i]
						instanceof ElectricCar) {
					UpdateElectricCar.updateElectricCar();
						} 
				
				else if (VehicleInventoryTrack.vehicleInventory[i] instanceof DieselTruck) {
					UpdateDieselTruck.updateDieselTruck();
				} 
				
				else if (VehicleInventoryTrack.vehicleInventory[i] instanceof GasolineCar) {
					UpdateGasolineCar.updateGasolineCar();
				} 
				
				else if(VehicleInventoryTrack.vehicleInventory[i] instanceof ElectricTruck) {
					UpdateElectricTruck.updateElectricTruck();
						}
				System.out.println("Your vehicle informations have been updated successfully!");
				break;
			}
		}
				
		
	}
	
	static void updateMake(){
		System.out.println("Enter the new brand of the vehicle: ");
		String newMake = keyboard.nextLine();
		VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition].setMake(newMake);
		
	}
	
	static void updateModel(){
		System.out.println("Enter the new model of the vehicle: ");
		String newModel = keyboard.nextLine();
		VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition].setModel(newModel);
		
	}
	
	static void updateYearOfProd(){
		System.out.println("Enter the new year of production of the vehicle: ");
		int newYearOfProd = keyboard.nextInt();
		VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition].setYearOfProduction(newYearOfProd);
		
	}
	static void updateMaxCapacity(){
		System.out.println("Enter the new maximum capacity of the vehicle: ");
		double newMaxCapacity = keyboard.nextDouble();
		((Truck)VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition]).setMaxCapacity(newMaxCapacity);
		
	}
	
	static void updateMaxAutonomyTruck(){
		System.out.println("Enter the new maximum autonomy of the vehicle: ");
		double newMaxAutonomy = keyboard.nextDouble();
		((ElectricTruck)VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition]).setMaxAutonomy(newMaxAutonomy);
		
	}
	
	static void updateMaxAutonomyCar(){
		System.out.println("Enter the new maximum autonomy of the vehicle: ");
		double newMaxAutonomy = keyboard.nextDouble();
		((ElectricCar)VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition]).setMaxAutonomy(newMaxAutonomy);
		
	}
	static void updateTankCapacity(){
		System.out.println("Enter the new tank capacity of the vehicle: ");
		double newTankCapacity = keyboard.nextDouble();
		((DieselTruck)VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition]).setTankCapacity(newTankCapacity);
		
	}
	static void updateMaxPassengers(){
		System.out.println("Enter the new tank capacity of the vehicle: ");
		int newMaxPassengers = keyboard.nextInt();
		((ElectricCar)VehicleInventoryTrack.vehicleInventory[vehicleArrayPosition]).setMaxPassengers(newMaxPassengers);
		
	}
}