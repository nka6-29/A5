import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Fleet{

	public static void main(String[] args) throws Exception{

		ArrayList<Vehicle> cars = new ArrayList<Vehicle>(); // create an arraylist of our objects we create from the Vehicle class
		// Each vehicle with ALL of its methods and datafields will be stored in each element of our arraylist. Remember an ArrayList stores every value as an object instead of a primitive like a normal array
		Scanner kbd = new Scanner(System.in);
		System.out.println("What is the name of the database textfile?");
		String db = kbd.next();
		Scanner DBread = new Scanner(new File(db));


		while (DBread.hasNext() ){
			//System.out.println("What type of vehicle are you entering? 1: Car, 2: Truck, 3: Motorcycle)");
			String VC = DBread.next();
			if(VC.equals("A")){
				Car car1 = new Car();
				car1.setClassification("A");
				car1.setMake(DBread.next()); // could be a car1.setMake(make)
				car1.setModel(DBread.next());
				car1.setWeight(DBread.nextInt());
				car1.setColor(DBread.next());
				car1.setYear(DBread.nextInt());
				car1.setMPG(DBread.nextDouble());
				car1.setSeating(DBread.nextInt());

				cars.add(car1);

			}
			else if(VC.equals("T")){
				Truck truck1 = new Truck();
				truck1.setClassification("T");
				truck1.setMake(DBread.next()); // could be truck1.setMake(kbd.next())
				truck1.setModel(DBread.next());
				truck1.setWeight(DBread.nextInt());
				truck1.setColor(DBread.next());
				truck1.setYear(DBread.nextInt());
				truck1.setMPG(DBread.nextDouble());
				truck1.setSeating(DBread.nextInt());
				truck1.setHauling(DBread.nextInt());

				cars.add(truck1);

			}
			else{
				Motorcycle motorcycle1 = new Motorcycle();
				motorcycle1.setClassification("MC");
				motorcycle1.setMake(DBread.next());
				motorcycle1.setModel(DBread.next());
				motorcycle1.setWeight(DBread.nextInt());
				motorcycle1.setColor(DBread.next());
				motorcycle1.setYear(DBread.nextInt());
				motorcycle1.setMPG(DBread.nextDouble());
				/*System.out.println("What is the weight of the motorcycle?");
		    int weight = kbd.nextInt();
				motorcycle1.setWeight(weight);*/

				cars.add(motorcycle1);

			}


		}
		System.out.println("What vehicle class would you like to list? (A: Automobile, T: Truck, MC: Motorcycle");
		String search = kbd.next();
		int count=0;

		//System.out.println("Now we will go through all objects created from the superclass Vehicle");
		for(Vehicle car : cars)
		{
			//int count;
			//Vehicle vehicle1 = new Vehicle();
			String Vclass = car.getClassification();
			if(Vclass.equals(search)){
				car.stats();
				count++;
			}
			//car.stats();
		}

		System.out.println(count + " vehicles of the " + search + " class have been found and returned by your search.");



	}



}
