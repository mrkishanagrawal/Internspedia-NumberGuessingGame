import java.util.*;

public class NumberGuessing {
    public static void
    guessingNumberGame(){
        Scanner sc = new Scanner(System.in);
        int no = 1 + (int)(100 * Math.random());
        int K = 5;
        int a, guess;
        System.out.println("Choose a Number between 1 to 100. Guess the number within 5 trials.");
        for (a = 0; a < K; a++) {
            System.out.print("Guess the number :");
            guess = sc.nextInt();
            if (no == guess) {
                System.out.println( "Congratulations! You guessed the number.");
                break;
            }
            else if (no > guess && a != K - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (no < guess && a != K - 1) {
                System.out.println("The number is less than " + guess);
            }
        }
        if (a == K) {
            System.out.println("You have exhausted K trials.");
            System.out.println("The number was " + no);
        }
        sc.close();
    }
    public static void main(String arg[])
    {
        guessingNumberGame();
    }

}
