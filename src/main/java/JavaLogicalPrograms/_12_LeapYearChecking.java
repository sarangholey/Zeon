package JavaLogicalPrograms;

public class _12_LeapYearChecking {

	public static void main(String[] args) {
		
		// leap year is divisible by 4 completely which are ending with 00
		// and century years are leap years if divisible perfectly by 400
		// ex- 1900 is not leap year as its not divisible by 400
		// ex- 2012 is leap year as its divisible by 4
		
		int year = 1900; // 2012 2020 2016
		boolean leapYear = false;
		
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					leapYear = true;
				}
				else {
					leapYear = false;
				}
			}
			else {
				leapYear = true;
			}
		}
		else
		{
			leapYear = false;
		}
		if(leapYear)
		{
			System.out.println("Entered year is a leap year");
		}
		else {
			System.out.println("Entered year is not a leap year");
		}
		
		
	}

}
