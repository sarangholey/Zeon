package Javasessions;

public class Car extends Vehicle {
	public void Start()
	{
		System.out.println("Car -- Start Method");
	}
	public void Stop()
	{
		System.out.println("Car -- Stop Method");
	}
	public void fillfuel()
	{
		System.out.println("Car -- Fill fuel Method");
	}
	public static void musicSystem()
	{
		System.out.println("Car -- Music system");
	}
	public final void lights()
	{
		System.out.println("Car -- lights");
	}
	public void Start(String method)
	{
		System.out.println("Car -- Start with keys Method");
	}
}

