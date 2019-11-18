package task4;

import java.util.Scanner;

public class Task_4 {
    static int counter=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence=scanner.nextLine();
        String word=scanner.nextLine();
        findIncludes(sentence, word);
        System.out.println("Amount="+counter);
    }

    private static int findIncludes(String sentence, String word) {
        if (sentence.indexOf(word)!=-1) {
            findIncludes(sentence.substring(sentence.indexOf(word)+word.length()), word);
            counter++;
            return counter;
        }
        else return counter;
    }
}
