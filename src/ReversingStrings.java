import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wordReverse("reverse this string");
        System.out.println();
        stringReverse("reverse this string");
        System.out.println();
        stringWordReverse("reverse this string");

//        System.out.println("Enter a word to reverse: ");
//        String string = scanner.nextLine();
//        if(string.contains(" ")){
//            stringReverse(string);
//        }//else {
////            stringReverse(string);
////        }
    }

    public static void wordReverse(String string) {
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }
    }

    public static void stringReverse(String string) {
        String[] arr = string.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
//
        }
    }

    public static void stringWordReverse(String string) {
        char[] arr = string.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
//
        }

    }
}
