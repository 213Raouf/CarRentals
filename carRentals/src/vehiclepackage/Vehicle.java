// --------------------------------------------------------
// Assignment 1
// Written by:Raouf Ouibrahim
// ---------------------------------------------------------

package vehiclepackage;

public abstract class Vehicle {
	private boolean leased;
    private String plateNumber;
    private String make;
    private String model;
    private int yearOfProduction;

    public Vehicle(String make, String model, int yearOfProduction) {
        this.make = make;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.plateNumber = generatePlateNumber();
    }
    
    public Vehicle() {
		this.make = null;
		this.model = null;
		this.yearOfProduction =0;
        this.plateNumber = generatePlateNumber();

	}
    
    public Vehicle(Vehicle otherVehicle) {
		this.make = otherVehicle.make;
		this.model = otherVehicle.model;
		this.yearOfProduction =otherVehicle.yearOfProduction;
        this.plateNumber = generatePlateNumber();

	}

    protected abstract String generatePlateNumber();

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    
    public boolean getLeased() {
        return leased;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setLeased(Boolean leased) {
        this.leased = leased;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null || this.getClass() != otherObject.getClass())
        	return false;
        
        Vehicle otherVehicle = (Vehicle) otherObject;
        return yearOfProduction == otherVehicle.yearOfProduction &&
               make.equalsIgnoreCase(otherVehicle.make) &&
               model.equalsIgnoreCase(otherVehicle.model);
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year of Production: " +
               yearOfProduction + ", Plate: " + getPlateNumber();
    }
}
abstract class Truck extends Vehicle{
	
	double maxCapacity;
	
	public Truck(String make, String model, int yearOfProduction,double maxCapacity) {
		super(make, model,yearOfProduction);
		this.maxCapacity = maxCapacity;
	}
	
	public Truck() {
		super();
		this.maxCapacity = 0;
	}
	
	public Truck(Truck otherTruck) {
		super(otherTruck);
		this.maxCapacity = otherTruck.maxCapacity;
	}

	public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public double getMaxCapacity() {
        return this.maxCapacity;
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
        	return false;
        
        Truck otherTruck = (Truck) otherObject;
        return maxCapacity == otherTruck.maxCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Max capacity: " + maxCapacity + "KG";
    }
	
}
abstract class Car extends Vehicle{
	
	int maxPassengers;
	
	public Car(String make, String model, int yearOfProduction,int maxPassengers) {
		super(make, model,yearOfProduction);
		this.maxPassengers = maxPassengers;
	}
	
	public Car() {
		super();
		this.maxPassengers = 0;
	}
	
	public Car(Car otherCar) {
		super(otherCar);
		this.maxPassengers= otherCar.maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }
	
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
        	return false;
        
        Car otherCar = (Car) otherObject;
        return maxPassengers == otherCar.maxPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Max passengers: " + maxPassengers;
    }
}






