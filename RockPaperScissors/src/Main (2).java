import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int wins = 0;
        int losses = 0;

        while(true){
            System.out.print("Please choose rock, paper, or scissors.  To exit the game, type leave \n" );
            String myMove = in.nextLine();

            if(myMove.equals("leave")) {
                break;
            }


            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("Invalid move, please try again.");
            } else {



                int random = (int)(Math.random()*3);
                String opponentMove = "";
                if(random == 0) {
                    opponentMove = "rock";
                } else if(random == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("Opponent move: " + opponentMove);

                if(myMove.equals(opponentMove)) {
                    System.out.println("Tie!");
                }else if((myMove.equals("rock")) &&
                        opponentMove.equals("scissors")|| (myMove.equals("scissors")) &&
                        (myMove.equals("paper")) || (myMove.equals("paper")) && opponentMove.equals("rock")) {
                    System.out.println("You won!");
                    wins++;
                }else{
                    System.out.println("You lost!");
                    losses++;


                }
            }
            System.out.println("-----------------");
            System.out.println("You won " + wins + " game(s) ");
            System.out.println("-----------------");
            System.out.println("You lost " + losses + " game(s) ");
            System.out.println("-----------------");
        }
        System.out.println("Thank you for playing! See you later. ");
    }
}




