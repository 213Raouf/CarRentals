//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

public class VehicleInventoryTrack {
    public static Vehicle[] vehicleInventory = new Vehicle[50];
    public static int vehicleCount = 0;
    public static void showAllLeasedVehicles(){
    	for(int i = 0;i<vehicleCount;i++) {
    		if(vehicleInventory[i].getLeased()==true) {
    			System.out.printf("""
    					Vehicle %d: %s %n
    					""", i,vehicleInventory[i].toString());
    		}
    	}
    }
    
}