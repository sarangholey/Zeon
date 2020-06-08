package JavaLogicalPrograms;

public class _17_MultiplicationTableGeneration {

	public static void main(String[] args) {
	
		// 5x1 = 5
		// 5x2 = 10
		
		int number = 5;
		System.out.println("Table for number "+number);
		for (int i = 1; i <=10; i++) {
			System.out.println(number + " x "+ i + " = " + (number*i));
		}
		

	}

}
