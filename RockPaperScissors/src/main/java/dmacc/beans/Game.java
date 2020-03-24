package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner(player1, computerPlayer);
		}
	
	
	private void setComputerPlayerToRandom() {
	    Random rand = new Random();
	    int computer = rand.nextInt(3);

	    if(computer == 0){
	    	computerPlayer = "rock";
	    }
	    else if(computer == 1){
	    	computerPlayer = "paper";
	    }
	    else if(computer == 2){
	    	computerPlayer = "scissors";
	    }
		
	}


	private String determineWinner(String player1, String computerPlayer) {
		winner = "You, the Human Player";
		if (player1.equals("rock")){
			if (computerPlayer.equals("rock")) {
				winner = "Tie";
			}else if (computerPlayer.equals("paper")) {
				winner = "the Computer";
			}
		}
		
		if (player1.equals("paper")) {
			if (computerPlayer.equals("paper")) {
				winner = "Tie";
			}else if (computerPlayer.equals("scissors")) {
				winner = "the Computer";
			}
		}
		
		if (player1.equals("scissors")) {
			if (computerPlayer.equals("scissors")) {
				winner = "Tie";
			}else if (computerPlayer.equals("rock")) {
				winner = "the Computer";
			}
		}
		return winner;
	}

}

