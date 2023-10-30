import java.util.Scanner;

public class ReversingStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        wordReverse("reverse this string");
        System.out.println();
        stringReverse("reverse this string");
        System.out.println();
        //stringWordReverse("reverse this string");
        System.out.println();
        stringReverse1("reversing this string");



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
    

    public static void stringReverse1(String string) {
        String[] arr = string.split("\\s");
        String reverseWord="";
        for (String string2 : arr) {
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);
    }
}
