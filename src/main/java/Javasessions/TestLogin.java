package Javasessions;

public class TestLogin {
	public static void main(String[] args) {
		LoginPage lp = new LoginPage(); // This will run only LoginPage class constructor
		lp.title();
		lp.url();
		lp.footerLinks();
		lp.doLogin();
		lp.logo(); // will access LoginPage overridden method
		lp.colour(); // will access color method from abstract class as its not overridden
		
		// top casting
		Page p = new LoginPage(); // This will run Page class costructor and then LoginPage
		// class constructor
		p.title();
		p.url();
		p.footerLinks();
		p.logo(); // will access LoginPage overridden mathod
		p.colour(); // will access color method from abstract class as its not overridden
		// p.dologin(); as dologin is not available in parent class
		// it can't be accessed 
		
		// Try to create obj of abstract class
		// Page p = new Page(); // its not allowed
	}
}
