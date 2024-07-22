import java.io.*;
import java.util.*;

public class Solution {
    // static boolean isAnagram(String a, String b) {
    //     // Complete the function
        
        
        
        
    // }
    // java 8
    public static void main(String[] args) {

        // java 15 answer

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        String lower1 = text1.toLowerCase();
        String lower2 = text2.toLowerCase();
        char[] arr1 = lower1.toCharArray();
        char[] arr2 = lower2.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }
}