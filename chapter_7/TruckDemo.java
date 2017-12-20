interface IVehicle {
    int range();
    double fuelneeded(int miles);
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}

class Vehicle implements IVehicle {   
  private int passengers; // number of passengers   
  private int fuelcap;    // fuel capacity in gallons  
  private int mpg;        // fuel consumption in miles per gallon  
  
  // This is a constructor for Vehicle. 
  Vehicle(int p, int f, int m) { 
    passengers = p; 
    fuelcap = f; 
    mpg = m; 
  } 
 
  // Return the range.  
  public int range() {  
        return mpg * fuelcap;  
  }  
          
  // Compute fuel needed for a given distance. 
  public double fuelneeded(int miles) {  
    return (double) miles / mpg;  
  }  
    // Accessor methods for instance variables.
    public int getPassengers() { return passengers; }
    public void setPassengers(int p) { passengers = p; }
    public int getFuelcap() { return fuelcap; }
    public void setFuelcap(int f) { fuelcap = f; }
    public int getMpg() { return mpg; }
    public void setMpg(int m) { mpg = m; }

}   

class Truck extends Vehicle {
	private int cargocap; // cargo capacity in pounds

	Truck(int p, int f, int m, int c) {
		super(p, f, m);

		cargocap = c;
	}

	int getCargo() { return cargocap; }
	void putCargo(int c) { cargocap = c; }
}

class TruckDemo {   
  public static void main(String args[]) {   
    // construct some trucks
    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);
    double gallons;
    int dist = 252;

    gallons = semi.fuelneeded(dist);

    System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
    System.out.println("To go " + dist + " miles semi needs " +
            gallons + " gallons of fuel.\n");

    // construct complete vehicles 
    Vehicle minivan = new Vehicle(7, 16, 21);   
    Vehicle sportscar = new Vehicle(2, 14, 12);   
  
    gallons = minivan.fuelneeded(dist);   
   
    System.out.println("To go " + dist + " miles minivan needs " +  
                       gallons + " gallons of fuel.");  
      
    gallons = sportscar.fuelneeded(dist);   
   
    System.out.println("To go " + dist + " miles sportscar needs " +  
                       gallons + " gallons of fuel.");  
      
  }   
}
