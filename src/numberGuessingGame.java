import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {

    public static void  main(String[] args){
        Scanner reader = new Scanner(System.in);
        boolean playGame = true;
        Random randomNumber = new Random();
        int rand = randomNumber.nextInt(100);
        while (playGame){
            System.out.println(rand);
            System.out.println("Enter a Guess..");
            int guess = reader.nextInt();
            if (guess < rand){
                System.out.println("Your guess of "+guess+" is too LOW");
            } else if (guess > rand) {
                System.out.println("Your guess of "+guess+" is too HIGH");
            }else {
                System.out.println("Your guess of "+guess+" is CORRECT!!");
                playGame = false;
            }
        }
    }
}
