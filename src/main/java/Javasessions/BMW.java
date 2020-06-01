package Javasessions;

public class BMW extends Car{
	@Override
	public void Start()
	{
		System.out.println("BMW -- Start Method");
	}
	@Override
	public void Stop()
	{
		System.out.println("BMW -- Stop Method");
	}
	// @Override - as this is not overridden method
	public void autoparking()
	{
		System.out.println("BMW -- auto parking Mathod");
	}	
//	@Override
//	public void musicSystem() // As this is static type method present in parent class
//	{						  // And we cannot override static methods
//		System.out.println("Car -- Music system");
//	}
//	@Override // as in parent class this method is declared as final
//	public final void lights()
//	{
//		System.out.println("Car -- lights");
//	}
	@Override
	public void Start(String method)
	{
		System.out.println("Car -- Start with remote Method");
	}
}
