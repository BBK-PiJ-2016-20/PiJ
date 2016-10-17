import java.util.Scanner;

public class Calculator {
	
	private int num1;
	private int num2; 
	
	public Calculator (int x, int y) {
		
		this.num1 = x;
		this.num2 = y;
	}
	
	public int add( ) {
		return num1+num2;
	}
	
	public int subtract( ) {
		return num1-num2;
	}
	
	public int multiply( ) {
		return num1*num2;
	}
	
	public int divide( ) {
		if(num2!=0)
			return num1/num2;
		else
		{
			System.out.println("The denomenator is zero");
			return 0;
		}
	}
	
	public int modulus( ) {
		return num1%num2;
	}
	

	
	/*public subtract () {
		
		int result;
		result = sub.x - sub.y;
		return result;
	}
	
	public multiply (Calculator mul) {
		
		int result;
		result = mul.x * mul.y;
		return result;
	}
	
	public division (Calculator div) {
		
		int result;
		result = div.x / div.y;
		return result;
	}
	
	public modulus (Calculator mod) {
		
		int result;
		result = mod.x % mod.y;
		return result;
	}
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
		int num1 = 0, num2 = 0;
		int option = 0, result = 0;
		System.out.print ("Enter first number: ");
		num1 = sc.nextInt();
		System.out.print ("Enter second number: ");
		num2 = sc.nextInt();
		System.out.print ("Choose - 1. Add, 2. Subtract, 3. Multiply, 4. Divide, 5. Modulus:  ");
		option = sc.nextInt();
		Calculator cal = new Calculator (num1, num2);

		switch (option) {
			
			case 1: 
			result = cal.add();
			System.out.print ("The result is: " + result);
			break;
			
			case 2: 
			result = cal.subtract();
			System.out.print ("The result is: " + result);
			break;
			
			case 3: 
			result = cal.multiply();
			System.out.print ("The result is: " + result);
			break;
			
			case 4: 
			result = cal.divide();
			System.out.print ("The result is: " + result);
			break;
			
			case 5: 
			result = cal.modulus ();
			System.out.print ("The result is: " + result);
			break;
		}
	}
}