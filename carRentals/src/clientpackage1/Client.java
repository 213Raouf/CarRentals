//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package clientpackage;
import java.util.*;
import vehiclepackage.*;

public class Client {
    private String firstName;
    private String lastName;
    private String address;
    Vehicle[] vehiclesArray = new Vehicle[10];
    private int vehiclesCount=0;

    // Default constructor
    public Client() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
    }

    // Parameter constructor
    public Client(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
 // Copy constructor
    public Client(Client otherClient) {
        this.firstName = otherClient.firstName;
        this.lastName = otherClient.lastName;
        this.address = otherClient.address;
        this.vehiclesArray = otherClient.vehiclesArray;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vehicle[] getVehiclesArray() {
        return vehiclesArray;
    }

    public void setVehiclesArray(Vehicle[] vehiclesArray) {
        this.vehiclesArray = vehiclesArray;
    }

    // Equals method
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null || this.getClass() != otherObject.getClass())
        	return false;
        
        Client otherClient = (Client) otherObject;
        return firstName == otherClient.firstName &&
               lastName.equalsIgnoreCase(otherClient.lastName) &&
               address.equalsIgnoreCase(otherClient.address);
    }

    // toString method
    @Override
    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName +
               ", Adress: " + address + ", Vehicles: " + Arrays.toString(vehiclesArray);
    }
    
    void leaseVehicle(Vehicle vehicle) {
    	if(vehicle!= null && vehicle.getLeased()!=true) {
			if (vehicle	instanceof ElectricCar) {
				vehiclesArray[vehiclesCount] =vehicle;
					} 
		
			else if (vehicle instanceof DieselTruck) {
				vehiclesArray[vehiclesCount] =vehicle;
			} 
			
			else if (vehicle instanceof GasolineCar) {
				vehiclesArray[vehiclesCount] =vehicle;

			} 
			
			else if(vehicle instanceof ElectricTruck) {
				vehiclesArray[vehiclesCount] = vehicle;

					}
			vehicle.setLeased(true);
			System.out.println("Clients vehicle number "+ vehiclesCount++ + " has been leased successfuly!");
    	}
    	else if(vehicle == null)
    		System.out.println("Can't lease an unexistant vehicle. Please try a different one! ");
    
    	else if(vehicle.getLeased()==true)
		System.out.println("This vehicle is already leased to another client. Please try a different one! ");
}
    
    void returnVehicle(Vehicle vehicle) {
    	if (vehicle != null) {
            for (int i = 0; i < vehiclesCount; i++) {
                if (vehiclesArray[i] == vehicle) {
                    vehiclesArray[i] = null;
                    vehicle.setLeased(false);
                    System.out.println("Vehicle has been returned successfully!");
                    return;
                }
            }
            System.out.println("Vehicle not found in client's leased list.");
        } else {
            System.out.println("Can't remove a nonexistent vehicle. Please try a different one!");
        }
    }
    
    void showClientsVehicles() {
    	for(int i = 0;i<vehiclesCount;i++) {
    		if(vehiclesArray[i]!=null)
    			System.out.printf("""
    					Client's vehicle %d: %s %n
    					""", i,vehiclesArray[i].toString());
    	}
    }
}
