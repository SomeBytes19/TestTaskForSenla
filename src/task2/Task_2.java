package task2;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        if (!(number1==0 && number2==0)){
        if ((number1%(int)number1==0) && (number2%(int)number2==0) || (number1==0 || number2==0))
            System.out.println( "НОД=\n"+findNod((int)number1, (int)number2)
                    +"\nНОК=\n"+findNok((int)number1, (int)number2) );
        else System.out.println("Error. Some number isn't an integer"); }
        else System.out.println("Error. All numbers are 0");
    }

    private static int findNod(int n1, int n2) {
        if (n2==0) return Math.abs(n1);
        return findNod(n2, n1%n2);
    }

    private static int findNok(int n1, int n2) {
        return (n1/findNod(n1,n2)*n2);
    }
}
