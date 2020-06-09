package JavaLogicalPrograms;

public class _25_PrimeNumberWithIntervalsOfRange {

	public static void main(String[] args) {

		// finding prime number from start num and end number
		// ex - from 20 to 40

		int lowRange = 20;
		int hignRange = 50;

		while (lowRange < hignRange) 
		{
			boolean flag = false;
			for (int i = 2; i < lowRange / 2; i++) 
			{
				if (lowRange % i == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(lowRange + " ");
			}

			lowRange++;
		}

	}

}
