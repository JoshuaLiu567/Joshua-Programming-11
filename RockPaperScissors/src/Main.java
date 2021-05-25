import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose rock, paper, or scissors: \n" );
        String myMove = in.nextLine();


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
            }else{
                System.out.println("You lost!");

                }
        }
    }
}




