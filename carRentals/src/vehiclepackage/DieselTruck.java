package vehiclepackage;

public class DieselTruck extends Truck{

	private static int dieselTruckCount = 1001;
	
	double tankCapacity;
	
	public DieselTruck(String make, String model, int yearOfProduction,double maxCapacity,double tankCapacity) {
		super(make, model,yearOfProduction,maxCapacity);
		this.tankCapacity = tankCapacity;
	}
	
	public DieselTruck() {
		super();
		this.tankCapacity = 0;
	}
	
	public DieselTruck(DieselTruck otherDieselTruck) {
		super(otherDieselTruck);
		this.tankCapacity= otherDieselTruck.tankCapacity;
	}
	
	public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }
	
    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
        	return false;
        
        DieselTruck otherDieselTruck = (DieselTruck) otherObject;
        return tankCapacity == otherDieselTruck.tankCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Tank Capacity: " + tankCapacity + "L";
    }

	@Override
	protected String generatePlateNumber() {
		return "DT"+ dieselTruckCount++;
	}
	
}
