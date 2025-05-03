package vehiclepackage;

public class ListVehiclesByCategory {
	static void listVehiclesBycategory(){
		ElectricTruck[] electricTrucksArray = new ElectricTruck[VehicleInventoryTrack.vehicleCount];
		int electricTruckscount =0;
		DieselTruck[] dieselTrucksArray = new DieselTruck[VehicleInventoryTrack.vehicleCount];
		int dieselTruckscount =0;
		GasolineCar[] gasolineCarsArray = new GasolineCar[VehicleInventoryTrack.vehicleCount];
		int gasolineCarscount =0;
		ElectricCar[] electricCarsArray = new ElectricCar[VehicleInventoryTrack.vehicleCount];
		int electricCarscount =0;
	for(int i = 0; i< VehicleInventoryTrack.vehicleInventory.length;i++) {
		if(VehicleInventoryTrack.vehicleInventory[i]!=null) {
		if (VehicleInventoryTrack.vehicleInventory[i]
				instanceof ElectricCar) {
			electricCarsArray[electricCarscount++] = (ElectricCar) VehicleInventoryTrack.vehicleInventory[i];
		} 
		
		else if (VehicleInventoryTrack.vehicleInventory[i] instanceof DieselTruck) {
			dieselTrucksArray[dieselTruckscount++] =(DieselTruck) VehicleInventoryTrack.vehicleInventory[i];

		} 
		
		else if (VehicleInventoryTrack.vehicleInventory[i] instanceof GasolineCar) {
			gasolineCarsArray[gasolineCarscount++] =(GasolineCar) VehicleInventoryTrack.vehicleInventory[i];

		} 
		
		else if(VehicleInventoryTrack.vehicleInventory[i] instanceof ElectricTruck) {
			electricTrucksArray[electricTruckscount++] =(ElectricTruck) VehicleInventoryTrack.vehicleInventory[i];

		}
		}
	}
	System.out.println("\n\tElectric Cars\n-------------------------------------\n");
	for(int i =0;i<electricCarscount;i++) {
		System.out.println(electricCarsArray[i]);
	}
	System.out.println("\n\tGasoline Cars\n-------------------------------------\n");
	for(int i =0;i<gasolineCarscount;i++) {
		System.out.println(gasolineCarsArray[i]);
	}
	System.out.println("\n\tElectric Trucks\n-------------------------------------\n");
	for(int i =0;i<electricTruckscount;i++) {
		System.out.println(electricTrucksArray[i]);
	}
	System.out.println("\n\tDiesel Trucks\n-------------------------------------\n");
	for(int i =0;i<dieselTruckscount;i++) {
		System.out.println(dieselTrucksArray[i]);
	}
}
}

