//
// Assignment 1
// Written by: 40313873 Raouf Ouibrahim
//
package vehiclepackage;

public class GasolineCar extends Car{

	private static int gasolineCarCount = 1001;
		
	public GasolineCar(String make, String model, int yearOfProduction,int maxPassengers) {
		super(make, model,yearOfProduction,maxPassengers);
	}
	
	public GasolineCar() {
		super();
	}
	
	public GasolineCar(GasolineCar otherGasolineCar) {
		super(otherGasolineCar);
	}
	
    @Override
    public boolean equals(Object otherObject) {
        return super.equals(otherObject);
    }
    
    @Override
    public String toString() {
        return super.toString() ;
    }

	@Override
	protected String generatePlateNumber() {
		return "GC"+ gasolineCarCount++;
	}
	
}
