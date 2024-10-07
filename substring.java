import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String input = "hello and welcome to chitkara unniiivveeeryy";


        String longestWord = findLongestWord(input);


        System.out.println("The longest word is: " + longestWord);
    }

    public static String findLongestWord(String str) {

        String[] words = str.split(" ");

        String longest = "";


        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word
            }
        }

        return longest;
    }
}
