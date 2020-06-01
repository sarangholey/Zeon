package Javasessions;

public class TestHosptial {
	public static void main(String[] args) {
		ApplloHosptial ap = new ApplloHosptial();
		// all methods inside Appllo hospital  can be accessed
		ap.ambulanceServices();
		ap.emergencyServices();
		ap.ENTServices();
		ap.medicalInsuranceServices();
		ap.intership(); // can access default type method from interface
		ap.polioServices(); // method from grand parent interface
		ap.getPatientHistory(); // access method from parent class
		
		// Top casting - Up Casting
		USMedical us = new ApplloHosptial();
		us.physioServices();
		us.orthologyServices();
		us.oncologyServices();
		USMedical._911Servies(); // Calling static method with logic from interface
		System.out.println(USMedical.min_fees); // printing min_fees which is static final 
		// variable from USMedical Interface
		us.intership(); // can access default type method from interface USMedical
		us.polioServices(); // accessing method from WHO interface
		// us.ambulanceServices(); // as this method is not from USMedical interface
		// us.medicalInsuranceServices(); // as this method is not from USMedical interface
		// Here reference type check is used as logic, either implementation class reference
		// can access USMedical interface or USMedical interface reference varible can 
		// have access of it
		
		// Down Casting
		// ApplloHosptial ap = (ApplloHosptial)new USMedical(); // this is not allowed
		// evern you will get error at line new USMedical(); when written
	}
}
