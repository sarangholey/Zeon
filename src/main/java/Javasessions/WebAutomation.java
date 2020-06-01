package Javasessions;

public class WebAutomation {
	// public method to open browser
	public void launchBrowser()
	{
		intractWithBrowser();
	}
	// internal mathod for browser launching and other things
	private void intractWithBrowser()
	{
		checkBrowserCompatibility();
	}
	private void checkBrowserCompatibility()
	{
		checkBrowserVersion();
	}
	private void checkBrowserVersion()
	{
		checkBrowserWithOS();
	}
	private void checkBrowserWithOS()
	{
		System.out.println("Launching the browser.......");
	}
}
