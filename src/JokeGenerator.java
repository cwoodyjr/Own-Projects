import java.util.Random;
import java.util.Scanner;

public class JokeGenerator {
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("would you like to here a joke? y or n: ");
            String answer = reader.nextLine().toLowerCase();
            Random random = new Random();
            int rand;

            if(answer.toLowerCase().equals("y")){
               
                rand = random.nextInt(4)+1;
                
                    if(rand==1){
                        jokeA(reader);
                    }else if(rand==2){
                        jokeB(reader);
                    }else if(rand==3){
                        jokeC(reader);
                    }else if(rand==4){
                        jokeD(reader);
                    }else{
                        System.out.println("That threw an invalid option");
                    }

            }else if(answer.toLowerCase().equals("n")){

                rand = random.nextInt(3)+1;
                
                    if(rand==1){
                        retortA(reader);
                    }else if(rand==2){
                        retortB(reader);
                    }else if(rand==3){
                        retortC(reader);
                    }
                
            }else{
                System.out.println("Thats an invalid option");
            }
        }
    }
    public static void jokeA(Scanner reader){
                
                    System.out.println();
                    System.out.print("knock knock...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("who's there?...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("Luke...(press enter to continue)");
                    reader.nextLine();
                    System.out.print("Luke who?...(press enter to contiue)");
                    reader.nextLine();
                    System.out.print("Luke through the spyhole and you'll see!! ");
                
    }
    public static void jokeB(Scanner reader){
                    System.out.println();
                    System.out.println("how does a tortoise call his friends?");
                    System.out.println();
                    System.out.println("press enter to see the answer...");
                    reader.nextLine();
                    System.out.println();
                    System.out.println("USING A SHELLPHONE!!!");
                    
    }
    public static void jokeC(Scanner reader){
                    System.out.println();
                    System.out.println("What is black and white and read all over?");
                    System.out.println();
                    System.out.println("press enter...");
                    reader.nextLine();
                    System.out.println();
                    System.out.println("A NEWSPAPER!!!");
                    
                }
    public static void jokeD(Scanner reader){
                    System.out.println();
                    System.out.println("Did you hear about the man who invented the Knock Knock Jokes?");
                    System.out.println();
                    System.out.print("press enter...");
                    reader.nextLine();
                    System.out.println();
                    System.out.println("He won the NO-Bell Prize...Ha Ha HA");
                    }

    public static void retortA(Scanner reader){
        System.out.println("Your Boring!!");
    }
    public static void retortB(Scanner reader){
        System.out.println("Come Back When You've Found Your Sense of Humour... ");
    }
    public static void retortC(Scanner reader){
        System.out.println("Oh Well, I'll Save My Humour For Someone Else..Ha Ha Ha ");
    }
}