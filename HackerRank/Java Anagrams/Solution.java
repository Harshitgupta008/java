import java.io.*;
import java.util.*;

public class Solution {

    // java 8 = answer 1
    static boolean isAnagram(String a, String b) {
        // Complete the function
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        StringBuilder st1 = new StringBuilder(first);
        StringBuilder st2 = new StringBuilder(second);
        for (int i = 0; i < st1.length(); i++) {
            for (int j = i; j < st1.length(); j++) {
                if (st1.charAt(i) > st1.charAt(j)) {

                    char temp = st1.charAt(i);
                    st1.setCharAt(i, st1.charAt(j));
                    st1.setCharAt(j, temp);
                }
            }
        }
        for (int i = 0; i < st2.length(); i++) {
            for (int j = i; j < st2.length(); j++) {
                if (st2.charAt(i) > st2.charAt(j)) {

                    char temp = st2.charAt(i);
                    st2.setCharAt(i, st2.charAt(j));
                    st2.setCharAt(j, temp);
                }
            }
        }
         first = st1.toString();
         second = st2.toString();
        if (first.equalsIgnoreCase(second)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        // java 15 = answer 2
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String lower1 = text1.toLowerCase();
        String lower2 = text2.toLowerCase();
        char[] arr1 = lower1.toCharArray();
        char[] arr2 = lower2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}