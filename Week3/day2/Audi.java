package week3.day2;
//          Child extends Parent
public class Audi extends Car {
	
	public void advancedBraking() {
		System.out.println("Advanced Braking");

	}
	
	public static void main(String[] args) {
		Audi audiOptions=new Audi();
		audiOptions.advancedBraking();
		audiOptions.applyBrake();
		audiOptions.startDriving();
	}
	

}

// Audi extends Car extends Vehicle