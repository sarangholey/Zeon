package JavaLogicalPrograms;

public class _27_FactorsOfANumber {

	public static void main(String[] args) {
		
		// factors of 10 -> divisible completely by 1,2,5,10
		// 60 -> 1,2,3,4,5,6,10,12,15,20,30,60
		
		int num = 60;
		
		for (int i = 1; i < num; i++) {
			if(num % i == 0)
			{
				System.out.println(i +" ");
			}
		}

	}

}
