String str
boolean prime = true
print "Enter a number: "
str = System.console().readLine()
int i = Integer.parseInt(str)

int j = 2

while (j < i) {

	if (i % j == 0) 
		prime = false
	j++;
}

String m = (prime)? "The number is prime" : "The number is not prime"
print m

