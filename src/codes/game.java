package codes;

import java.util.Scanner;

public class game{

    public static void main(String[] args) {
        String[] choice = {"scissor","paper","stone"};
        Integer computerChoice, playerChoice;
        String winner="";

        Scanner scanner = new Scanner(System.in);

        SSP ssp = new SSP();
        
        while(winner.equals("")) {

            computerChoice = ssp.generateComputerChoice();
            System.out.println("Computer choice is " + computerChoice);

            System.out.println("Enter (1)Scissor, (2)Paper, or (3) Stone: ");
            playerChoice =  scanner.nextInt();

            if(!((playerChoice >=1) && (playerChoice <=3))) {
                System.out.println("Invalid number, only 1,2, or 3 allowed.");
                continue;
            } 

            winner = ssp.checkWinner(playerChoice, computerChoice);
            if(winner.equalsIgnoreCase("")) {
                System.out.println("It is a tie.");
            } else {
                System.out.println("The winner is "+ winner);
            }
        }

        scanner.close();


    }



}