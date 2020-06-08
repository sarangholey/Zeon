package JavaLogicalPrograms;

public class _13_PositiveOrNegativeNumberCheck {

	public static void main(String[] args) {
		
		double number = 13.33; // -12.33 0
		
		if(number < 0.0)
		{
			System.out.println(number + " is negative number");
		}
		else if (number > 0.0) {
			System.out.println(number + " is positive number");
		}
		else {
			System.out.println(number + " is zero");
		}

	}

}
