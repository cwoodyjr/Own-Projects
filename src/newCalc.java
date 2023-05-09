import java.util.Scanner;

public class newCalc{
    public static void main(String[] args) {
        
        // System.out.println(add(10, 5.5));
        // System.out.println(sub(10, 5.5));
        // System.out.println(mult(10, 5.5));
        // System.out.println(divi(10, 5));
        System.out.println("enter a number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            double input1 = scanner.nextDouble();

            System.out.println("enter a number: ");
            double input2 = scanner.nextDouble();
            
            options();
            int answer = scanner.nextInt();
            
            if (answer==1){
                System.out.println(add(input1, input2));
            }else if(answer==2){
                System.out.print(sub(input1, input2));
            }else if(answer==3){
                System.out.print(mult(input1, input2));
            }else if(answer==4){
                System.out.print(divi(input1, input2));
            }
        }
    


    }

    public static void options(){
        System.out.println("What would you like to do? ");
        System.out.println("1. add");
        System.out.println("2. subtract");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        

    }

    public static double add(double a,double b){
        System.out.print(a+" + "+ b + " = ");
        return a+b;
    }
    public static double sub(double a,double b){
        System.out.print(a+" - "+ b + " = ");
        return a-b;
    }
    public static double mult(double a,double b){
        System.out.print(a+" * "+ b + " = ");
        return a*b;
    }
    public static double divi(double a,double b){
        System.out.print(a+" / "+ b + " = ");
        return a/b;
    }
}