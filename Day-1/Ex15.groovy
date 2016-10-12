int num, numberToGruess, c
boolean finished = false

numberToGruess = Math.abs(1000*Math.random())

println "Try to guess my number!"

while (!finished){
	print "Tell me a number: "
	num = Integer.parseInt(System.console().readLine())
	if (num < numberToGruess){
		println "No! My number is higher."
	} else if (num > numberToGruess) {
		println "No! My number is lower"
	} else {
		println "CORRECT!"
		finished = true
	}
	c++
}
println "You needed " + c + " guesses."