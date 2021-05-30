import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type in your word");
        String word = scan.next();

        String secondWord = word.substring(1)+word.charAt(0);

        String flipped = new StringBuffer(secondWord).toString();

        System.out.println(""+secondWord+"");
        System.out.println("Please retype your phrase");
        scan.next();
        System.out.println(""+word+"");

        scan.close();

    }
}