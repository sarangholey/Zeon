package JavaLogicalPrograms;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler;

public class _26_ArmstrongNumberCheck {

	public static void main(String[] args) {
		
		// Armstrong number 153 = (1*1*1) + (5*5*5) + (3*3*3) = 1+125+27 = 153
		// 371 is also armstrong number
		
		int num = 153;
		int actualNumber = num;
		double result = 0;
		
		while(actualNumber != 0)
		{
			int n = actualNumber % 10;
			result = result + Math.pow(n, 3);
			
			actualNumber = actualNumber / 10;
				
		}
			
		if(result == num)
		{
			System.out.println(num + " is an armstrong number");
		}
		else {
			System.out.println(num + " is not an armstrong number");
		}
	}

}
