package Javasessions;

public class ThrowKeyword {
	public static void main(String[] args) {
		String Username = "Tom@gmail.com";
		if(Username.equals(" ") || Username.equals(""))
		{
			try {
				throw new Exception("Blank call value Exception");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Username is - "+Username);
		}
		/////////////////////////////////////////////////////
		launchUrl("https://www.google.com");
	}
	public static void launchUrl(String URL)
	{
		try {
			if(URL.equals(" ") || URL.equals("") || URL.isEmpty())
			{
				try {
					throw new Exception("Blank URL Exception");
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("URL value is blank or null, please pass correct URL");
				}
			}
			else {
				System.out.println("Launching URL with value - "+URL);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("URL is null please correct it");
		}
	}
}
