public class Motorcycle extends Vehicle {
	//private int weight;


	public void setWeight(int in){
		weight = in;
	}

	public int getWeight(){
		return weight;
	}

	//The parent class also has an identically named method, this method used in this subclass will OVERRIDE its parents stats() method when called from an object of this subclass.
	//This is polymorphism(many shapes)
	public void stats(){
		System.out.println("Vehicle make name: " + make);
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println("Vehicle weight: " + weight); //extra line of output to show the extra datafield
		System.out.println(notes);


	}


}
