import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What times table do you require?: ");
        int timesTable = reader.nextInt();

        for(int i = 1; i <= 12; i++){
            System.out.println(i + " x " + timesTable + " = " + (i*timesTable));
        }
    }
}
