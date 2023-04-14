import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word to reverse: ");
        String word = scanner.nextLine();

        stringReverse(word);
    }
    public static void stringReverse(String word){
        for (int i = word.length()-1; i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
