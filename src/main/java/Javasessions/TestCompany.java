package Javasessions;

public class TestCompany {
	public static void main(String[] args) {
		Company c = new Company();
		System.out.println(c.companyName);
		System.out.println(c.logo);
		System.out.println(c.profit);
		System.out.println(c.employeeCount);
		// System.out.println(c.businessLogic);// cannot be accessed as its a private property
		// System.out.println(c.revenue);// cannot be accessed as its a private property
		c.setBusinessLogic("Test busniess logic");
		System.out.println(c.getBusinessLogic());
	}
}
