import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        /*
        // solution 1:
        
        String rever = new StringBuilder(A).reverse().toString();
        if(A.equals(rever)){
            System.out.println(("Yes"));
        }else{
            System.out.println(("No"));
        }
        */
        // solution 2:
        
        StringBuilder st = new StringBuilder(A);
        int start = 0;
        int end = st.length()-1;
        while(start<end){
            char temp = st.charAt(start);
            st.setCharAt(start,st.charAt(end));
            st.setCharAt(end,temp);
            start++;
            end--;
        }
        
        if(A.equals(st.toString())){
            System.out.println(("Yes"));
        }else{
            System.out.println(("No"));
        }
    }
}

