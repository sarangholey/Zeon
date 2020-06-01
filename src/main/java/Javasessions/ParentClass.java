package Javasessions;

public class ParentClass {
	final public void m1() {
		System.out.println("m1 mathod");
	}
}

class childClass extends ParentClass {
//	@Override // cannot override as parent method is final
//	public void m1()
//	{
//		System.out.println("Child class m1 method");
//	}
}