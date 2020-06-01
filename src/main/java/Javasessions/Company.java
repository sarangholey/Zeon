package Javasessions;

public class Company {
	// public properties
	String companyName = "ABC Tech";
	String logo = "ABC Tech Logo";
	int profit = 45_000;
	int employeeCount = 450;
	// praivate properties
	private String businessLogic = "Abc Tech Business Logic";
	private int revenue = 8_000;

	// getter and setter
	//setter
	public void setBusinessLogic(String businessLogic)
	{
		this.businessLogic = businessLogic;
	}
	//getter
	public String getBusinessLogic()
	{
		return businessLogic;
	}
}
