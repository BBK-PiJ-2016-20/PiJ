boolean finished = false
int num
int biggest = 0
while (!finished) {

	if (num != -1) {
		print "Enter a number: "
		num = Integer.parseInt(System.console().readLine())
		if (biggest > num) {
			biggest = biggest
		} else {
			biggest = num
		}

	} else
		finished = true
}

println "The biggest number in the sequence was: " + biggest


