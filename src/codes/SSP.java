package codes;

import java.util.Random;

public class SSP {

    public Integer generateComputerChoice(){
        Random rand = new Random();
        return rand.nextInt(3);
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice) {

        playerChoice = playerChoice-1;
        String winner ="";

        if(playerChoice.equals(computerChoice)) {
            return "";
        }

        switch(playerChoice) {
            case 0: // Scissor
                if(computerChoice ==1) {
                    winner = "player";
                } else {winner = "computer";}
                break;

            case 1: // Paper
                if(computerChoice ==2) {
                    winner = "player";
                } else {winner = "computer";}
                break;

            case 2: // Stone
                if(computerChoice ==0) {
                    winner = "player";
                } else {winner = "computer";}
                break;        
        }
        return winner;

    }
    
}
