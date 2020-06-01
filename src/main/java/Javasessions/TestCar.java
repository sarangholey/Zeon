package Javasessions;

public class TestCar {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.Start(); // called from BMW class although Start() method is available in Car 
		// class but preference given to child class method
		b.Stop(); // Same as above
		b.fillfuel(); // called from car class (parent)
		b.autoparking(); // called from BMW class
		// so "b" object reference can call Overridden methods, methods only in BMW class
		// and methods from car class also.
		b.engine(); // method from grand parent class
		Car c = new Car();
		c.Start(); // methods called from parent class car
		c.Stop(); // Same as above
		c.fillfuel(); // Same as above
		// c.autoparking(); // As this method not available in car class we cannot call it
		
		Car c1 = new BMW(); // Child class object can be referred by parent class ref variable
		// This is called TopCasting or UpCasting in java
		c1.Start(); // Here always overridden i.e child class method is called.
		c1.Stop(); // Same above
		c1.fillfuel(); // same as above
		// c1.autoparking(); // this is not allowed as autoparking method is not available
		// in car class, as this is a violation of security. Here "Type reference check" 
		// is done. As autoparking is special method only for BMW class references.
		
		// BMW b1 = new Car(); // This is not allowed - called as downcasting
		BMW b1 = (BMW)new Car(); // this line will avoid only compile time error
		// but when we execute it it will throw java.lang.ClassCastException
		// Note - In Runtime downcasting is not allowed in java
	}
}
