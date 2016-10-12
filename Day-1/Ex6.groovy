String str = System.console().readLine()
int bigNumber = Integer.parseInt(str)

str = System.console().readLine()
int smallNumber = Integer.parseInt(str)

int remainder = bigNumber
int counter = 0
while (remainder >= smallNumber) {
	
	remainder = remainder - smallNumber
	counter++
}
print bigNumber + "divided by" + smallNumber + "is" + counter + ", remainder" + remainder