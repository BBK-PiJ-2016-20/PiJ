print "Enter first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Enter second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
print "Enter third number: "
str = System.console().readLine()
int num3 = Integer.parseInt(str)


	if (num1 < num2) {
		if (num2 < num3) 
			print num1 + ", " + num2 + ", " + num3
		else if (num3 > num1)
			print num1 + ", " + num3 + ", " + num2 
	} else if (num1 > num2) {
		if (num3 > num1)
			print num2 + ", " + num1 + ", " + num3
		else if (num3 > num2)
			print num2 + ", " + num3 + ", " + num1 
	} else {
		
		print num1 + ", " + num2 + ", " + num3 
	}
