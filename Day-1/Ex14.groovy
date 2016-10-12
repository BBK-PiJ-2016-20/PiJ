String str
boolean prime = true
int i, counter, j
j = 0
counter = 1

while (j < 1000) {
	i = 2
	prime = true
	while (i < counter){
	
		if (counter % i == 0) 
			prime = false			
		i++
	}
	if (prime == true){
		println counter + " is a prime number!"
		j++
	}
	counter++
}
println "There were " + j + " primes" 