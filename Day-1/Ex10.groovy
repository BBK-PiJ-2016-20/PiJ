boolean finished = false
boolean check = true
boolean check2 = true
int num
int num2 = 0
while (!finished) {

	print "Enter a number: "
	num = Integer.parseInt(System.console().readLine())
	if (num != -1) {	
		if ((num - num2) == 1 || (num - num2) == num || (num2 - num) == 1) {
			check = true
		} else {
			check2 = false
		}
			num2 = num
	} else
		finished = true
}

if (check && check2 == true)
	println "Oh YES bruh!"
else
	println "Oh nah"
