package LAB1;

import java.util.Scanner;

public class WordCount {
    public static int wordCount(String s) {
        String[] words = s.trim().split("\\s+");
        int count = 0;
        for (String word : words) {
            if (!word.matches("\\d+")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = wordCount(s);
        System.out.println("Word Count: " + result);
    }
}
