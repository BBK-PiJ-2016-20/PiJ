String play
boolean finished = false
int player1, player2 
enum Outcome {
	PP,
	PR,
	PS,
	RP,
	RR,
	RS,
	SP,
	SR,
	SS,
}

while (!finished){
	print "Enter Rock, Paper or Scissor letters: "

	play = System.console().readLine()

	Outcome = play

	switch (Outcome){
		case PP:
		println "Draw!"
		break;
	
		case PR:
		println "Player 1 wins this turn!"
		player1++
		break;
	}

	if (player1 - player2 >=3) {
		println "player 1 wins the game!"
		finished = true
	}
	else if {
		println "player 2 wins the game!"
		finished = true
	}
}






