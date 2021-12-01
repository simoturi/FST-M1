
public class Activity1_Car {
 
	String color;
	String 	transmission ;
	int make ;
	int tyres, doors ;
	
	Activity1_Car()
	{
		tyres = 4;
		doors = 4;
			
	}
	
	public void displayCharacterestics()
	{
		System.out.println("Color of my car is:- " +  color);
		System.out.println("Transmission of my car is:- " + transmission);
		System.out.println("Make of my car is:- " + make);
		System.out.println("No of the tyres are:- " + tyres);
		System.out.println("No of the doors are:- " + doors);
	}
	
	public void accelerate() {
		System.out.println("The car is moving");
	}
	public  void brake() {
		System.out.println("The car has stopped");
		
	} 
	
	

	}


