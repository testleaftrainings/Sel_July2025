package week3.day2;

//          Child extends Parent
//          Sub  extends  Super
public class Car extends Vehicle {

	public void applyBrake() {
		System.out.println("Brake applied");

	}

	public static void main(String[] args) {
		Car carOptions = new Car();
		carOptions.applyBrake();
		carOptions.startDriving();
	}

}
