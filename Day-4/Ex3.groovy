class Values {
	int b = 2;
	int e;
	int result;
	
	void userInput (Values v){
		//print "Enter base: "
		//v.b = Integer.parseInt(System.console().readLine())

		print "Enter exponent: "
		v.e = Integer.parseInt(System.console().readLine())
	}
}

int power (Values p){
	for (i = 0; i < p.e; i++){
		p.result = p.result * p.b;  
	}
	return p.result
}
int power2 (Values p2) {	
	p2.result = power(p2)
	return p2.result
}
Values v = new Values ()
v.userInput (v)
v.result = power2(v)
println v.result 
