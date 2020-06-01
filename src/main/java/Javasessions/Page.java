package Javasessions;

public abstract class Page {
	public Page() {
		System.out.println("Page Class costructor");
	}
	public abstract void title();
	public abstract void url();
	public abstract void footerLinks();
	public void logo()
	{
		System.out.println("Page -- Logo");
	}
	public void colour()
	{
		System.out.println("Page -- Colour");
	}
}
