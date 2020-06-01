package Javasessions;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Constructor of LoginPage Class");
	}
	@Override
	public void title() {
		System.out.println("Login page");
	}
	@Override
	public void url() {
		System.out.println("https://www.google.com");
	}
	@Override
	public void footerLinks() {
		System.out.println("Privacy policy");
	}
	// seperate method of LoginPage class
	public void doLogin()
	{
		System.out.println("Login page - doLogin");
	}
	@Override // overridden non abstract method from abstract class
	public void logo()
	{
		System.out.println("LoginPage -- Logo");
	} 
}
