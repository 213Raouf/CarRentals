//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

public class ElectricCar extends Car{

	private static int electricCarCount = 1001;
	
	double maxAutonomy;
	
	public ElectricCar(String make, String model, int yearOfProduction,int maxPassengers,double maxAutonomy) {
		super(make, model,yearOfProduction,maxPassengers);
		this.maxAutonomy = maxAutonomy;
	}
	
	public ElectricCar() {
		super();
		this.maxAutonomy = 0;
	}
	
	public ElectricCar(ElectricCar otherElectricCar) {
		super(otherElectricCar);
		this.maxAutonomy= otherElectricCar.maxAutonomy;
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
        
        ElectricCar otherElectricCar = (ElectricCar) otherObject;
        return maxAutonomy == otherElectricCar.maxAutonomy;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Max autonomy: " + maxAutonomy +"Km";
    }

	@Override
	protected String generatePlateNumber() {
		return "EC"+ electricCarCount++;
	}
	
}
