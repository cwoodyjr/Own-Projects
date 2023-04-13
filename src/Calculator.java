import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Enter an Equation: ");
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        solveEquation(equation);
    }
    public static void solveEquation(String equation){
        String[] arr;
        String operand = "";
        int num1;
        int num2;

        if (equation.contains("+")){
            arr = equation.split(Pattern.quote("+"));
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
            operand = "+";
            System.out.println(num1 + operand + num2 + " = " +(num1+num2));
        }else if (equation.contains("-")){
            arr = equation.split(Pattern.quote("-"));
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
            operand = "-";
            System.out.println(num1 + operand + num2 + " = " +(num1-num2));
        }else if (equation.contains("*")){
            arr = equation.split(Pattern.quote("*"));
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
            operand = "*";
            System.out.println(num1 + operand + num2 + " = " +(num1*num2));
        }else if (equation.contains("/")){
            arr = equation.split(Pattern.quote("/"));
            num1 = Integer.parseInt(arr[0]);
            num2 = Integer.parseInt(arr[1]);
            operand = "/";
            System.out.println(num1 + operand + num2 + " = " +(num1/num2));
        }else {
            System.out.println("The equation you entered was not valid");
        }

    }
}
