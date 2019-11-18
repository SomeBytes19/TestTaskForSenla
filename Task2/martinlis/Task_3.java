package by.martinlis;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence=scanner.nextLine();
        String delimiter=" ";
        String[] words=sentence.split(delimiter);
        String[] wordsSorted = words.clone();
        Arrays.sort(wordsSorted);
        for (int index=0; index < words.length; index++) {
            words[index]=words[index].substring(0,1).toUpperCase()+words[index].substring(1);
        }
        System.out.println("Upper first letter:\n"+String.join(delimiter, words));
        System.out.println("Sorting from A to Z:\n"+String.join(delimiter, wordsSorted));
        System.out.println("Count of words:\n"+words.length);
    }
}
