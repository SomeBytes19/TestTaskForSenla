package by.martinlis;

import java.util.Scanner;

public class Task_5 {

    static int n;
    public static void main(String[] args) {
        do {
            System.out.println("Input N please: ");
            Scanner scanner = new Scanner(System.in);
            n=scanner.nextInt();
        } while (n>100 || n<0);

        for(int number=0; number<=n; number++ ) {
            System.out.println(number+" : "+
                    (String.valueOf(number).equals(new StringBuffer(String.valueOf(number)).reverse().toString())));
        }
    }
}
