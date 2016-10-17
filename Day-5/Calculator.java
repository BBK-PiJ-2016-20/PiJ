import java.util.Scanner;

public class Calculator {
	
	public Calculator () {
		
	}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1-num2;
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2!=0)
			return num1/num2;
		else
		{
			System.out.println("The denomenator is zero");
			return 0;
		}
	}
	
	public int modulus(int num1, int num2) {
		return num1%num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		int num1 = 0, num2 = 0, option = 0, result = 0;
		System.out.print ("Enter first number: ");
		num1 = sc.nextInt();
		System.out.print ("Enter second number: ");
		num2 = sc.nextInt();
		System.out.print ("Choose - 1. Add, 2. Subtract, 3. Multiply, 4. Divide, 5. Modulus:  ");
		option = sc.nextInt();
		Calculator cal = new Calculator ();

		switch (option) {
			
			case 1: 
			result = cal.add(num1, num2);
			System.out.print ("The result is: " + result);
			break;
			
			case 2: 
			result = cal.subtract(num1, num2);
			System.out.print ("The result is: " + result);
			break;
			
			case 3: 
			result = cal.multiply(num1, num2);
			System.out.print ("The result is: " + result);
			break;
			
			case 4: 
			result = cal.divide(num1, num2);
			System.out.print ("The result is: " + result);
			break;
			
			case 5: 
			result = cal.modulus (num1, num2);
			System.out.print ("The result is: " + result);
			break;
		}
	}
}