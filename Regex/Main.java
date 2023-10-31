package Regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }

        /*
         * Regular Express patterns
         * [abc] = finds one character from between the brackets
         * [^abc] = finds one character not between the brackets
         * [0-9] = finds one character from the range 0 to 9
         * 
         * Meta Characters
         * | finds a match for any patterns separated cat|dog|fis
         * . finds one instance of any character
         * $ finds a match at the end of a string
         * \d finds a digit
         * \s finds a whitespace character
         * \b finds a match at the beginning of a word
         * \ u find unicode specified by hex
         * 
         * Quantifier
         * + matches any string with at least one n
         * n* matched any string that contains zero or more occurences of n
         * n? matches any string that contains zero or one occurence of n
         * n{x} ma
         */
    }
}