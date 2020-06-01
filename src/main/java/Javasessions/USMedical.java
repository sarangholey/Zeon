package Javasessions;

public interface USMedical extends WHO{
	public void physioServices();
	public void oncologyServices();
	public void orthologyServices();
	public void ENTServices(); // this same service can have in another interface
	// public static void radiologyServices(); // cannot create static prototype methods
	 public static void _911Servies()
	 {
		 System.out.println("USMedical -- Dental services");
	 }
	 
	 public static int min_fees = 10;
	 default void intership() // this method can't be static and ca't be overridden by class
	 {
		 System.out.println("USMedical intership method");
	 }
}
