import java.util.Random;
import java.util.Scanner;

public class JokeGenerator {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("would you like to here a joke? y or n:");
            String answer = reader.nextLine().toLowerCase();

            if(answer.toLowerCase().equals("y")){
                Random random = new Random();
                int rand = random.nextInt(3)+1;
                System.out.print(rand);
                jokeA();
            }else if(answer.toLowerCase().equals("n")){
                System.out.println("your BORING!!!");
            }else{
                System.out.println("Thats an invalid option");
            }
        }
    }
    public static void jokeA(){
                try (Scanner reader = new Scanner(System.in)) {
                    System.out.println();System.out.print("knock knock...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("who's there?...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("Luke...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("Luke who?...(press enter to contiue)");
                    reader.nextLine();
                    System.out.print("Luke through the spyhole and you'll see!! ");
                }
    }
}
