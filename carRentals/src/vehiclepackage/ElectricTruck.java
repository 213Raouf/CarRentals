//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

public class ElectricTruck extends Truck{

	private static int electricTruckCount = 1001;
	
	double maxAutonomy;
	
	public ElectricTruck(String make, String model, int yearOfProduction,double maxCapacity,double maxAutonomy) {
		super(make, model,yearOfProduction,maxCapacity);
		this.maxAutonomy = maxAutonomy;
	}
	
	public ElectricTruck() {
		super();
		this.maxAutonomy = 0;
	}
	
	public ElectricTruck(ElectricTruck otherElectricTruck) {
		super(otherElectricTruck);
		this.maxAutonomy= otherElectricTruck.maxAutonomy;
	}
	
	public void setMaxAutonomy(double maxAutonomy) {
        this.maxAutonomy = maxAutonomy;
    }

    public double getMaxAutonomy() {
        return this.maxAutonomy;
    }
	
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
        	return false;
        
        ElectricTruck otherElectricTruck = (ElectricTruck) otherObject;
        return maxAutonomy == otherElectricTruck.maxAutonomy;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Max autonomy: " + maxAutonomy + "Km";
    }

	@Override
	protected String generatePlateNumber() {
		return "ET"+ electricTruckCount++;
	}
	
}