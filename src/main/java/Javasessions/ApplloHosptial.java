package Javasessions;

public class ApplloHosptial extends GlobalPatientData implements USMedical,UKMedical,IndianMedical {

	@Override
	public void emergencyServices() {
		System.out.println("Appllo -- emergencyServices");
	}
	@Override
	public void nueroServies() {
		System.out.println("Appllo -- nueroServies");
	}
	@Override
	public void peditricServices() {
		System.out.println("Appllo -- peditricServices");
	}
	@Override
	public void ENTServices() {
		System.out.println("Appllo -- ENTServices");
	}
	@Override
	public void ambulanceServices() {
		System.out.println("Appllo -- ambulanceServices");
	}
	@Override
	public void physioServices() {
		System.out.println("Appllo -- physioServices");
	}
	@Override
	public void oncologyServices() {
		System.out.println("Appllo -- oncologyServices");
	}
	@Override
	public void orthologyServices() {
		System.out.println("Appllo -- orthologyServices");
	}
	// Non over ridden methods
	public void OPDServices() {
		System.out.println("Appllo -- OPDServices");
	}
	public void pathologyServices() {
		System.out.println("Appllo -- pathologyServices");
	}
	public void medicalInsuranceServices() {
		System.out.println("Appllo -- medicalInsuranceServices");
	}
	@Override
	public void polioServices() {
		System.out.println("WHO -- polioServices");
	}
}
