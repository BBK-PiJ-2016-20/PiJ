print "Enter first number: "
String str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Enter second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)

int counter = 1
int result = 0
while (counter <=  num2) {

	result = result + num1
	counter++
}
print result