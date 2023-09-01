abstract public class AbstractClassDemo {
	public static void main(String[] args) {
		Fortuner fortuner = new Fortuner();
		fortuner.features();
		A8EV a8 = new A8EV();
		getCarDetails(fortuner);
	}
	public static void getCarDetails(Car car) {
		car.brandName();
		car.fuelType();
		car.noOfWheels();
	}
}
abstract class Car {
	public Car() {
		System.out.println("Car class Constructor");
	}
	public final void noOfWheels() {
		System.out.println("4 Wheels with 1 Spare Wheel");
	}
	public abstract void brandName();
	public abstract void fuelType();
}
abstract class Toyota extends Car {
	public void brandName() {
		System.out.println("Brand is Toyota");
	}
	public abstract void features();
}
class Fortuner extends Toyota {
	public void fuelType() {
		System.out.println("Fuel Type is: Diesal");
	}
	public void features() {
		
	}
}
class A8EV extends Car {
	public void brandName() {
		System.out.println("A8 EV Brand is Audi");
	}
	public void fuelType() {
		System.out.println("Fuel Type is: Electric Car");
	}
}