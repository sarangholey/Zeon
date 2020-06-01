package Javasessions;

public class ThorwsKeyword {
	public static void main(String[] args) {
		ThorwsKeyword th = new ThorwsKeyword();
		try {
			th.launchBrowser();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void launchBrowser() throws Exception
	{
		System.out.println("Launch Browser ....");
		launchURL();
	}
	public void launchURL() throws Exception
	{
		System.out.println("Launch URL ....");
		login();
	}
	public void login() throws Exception
	{
		System.out.println("Do login ....");
		int i = 9/0;
		System.out.println("Loggin In");
	}
}

