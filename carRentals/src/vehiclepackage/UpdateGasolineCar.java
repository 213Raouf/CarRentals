package vehiclepackage;

import java.util.Scanner;

public class UpdateGasolineCar {
	
	static void updateGasolineCar() {
		Scanner keyboard = new Scanner(System.in);
		int updateAction;
		do {
			//Ask user to enter the number associated to what he wants to execute
			System.out.println("""
					
					Vehicle Update Menu:
						1.Update the Brand
						2.Update the Model
						3.Update Year of Production
						4.Update Maximum Number of Passengers
						5.Back
					Enter your choice: """);
			updateAction = keyboard.nextInt();
			
			switch(updateAction) {
			
				case 1:{
					UpdateVehicleInfo.updateMake();
					break;
				}
				
				case 2:{
					UpdateVehicleInfo.updateModel();
					break;
				}
				
				case 3:{
					UpdateVehicleInfo.updateYearOfProd();
					break;
				}
				case 4:{
					UpdateVehicleInfo.updateMaxPassengers();
					break;
				}
				
				case 5:{
					break;
				}
				default:{
					System.out.println("Your input is invalid,please try again.");
					break;
				}
			
			}
		}while(updateAction != 5);
	}
}
