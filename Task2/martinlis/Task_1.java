package by.martinlis;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number%(int)number==0 || number==0)
            System.out.println("Is your number a simple?\n-"+checkSimple((int)number)
            +"\nIs your number an even?\n-"+(number%2==0));
        else System.out.println("Error. Number isn't an integer");
    }

    private static boolean checkSimple(int number) {
        if (number<2) return false;
        for (int divider=2; divider<=number/2; divider++) {
            if (number%divider==0) return false;
        }
        return true;
    }
}
