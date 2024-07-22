import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
       for(int  i =0; i<n; i++){
           int a = sc.nextInt();
           list.add(a);
       }
       int term = sc.nextInt();
       for(int i = 0; i<term; i++){
           String chooise = sc.next();
           if(chooise.equals("Insert")){
               int position = sc.nextInt();
               int num = sc.nextInt();
               list.add(position,num);
           }else if(chooise.equals("Delete")){
               int position = sc.nextInt();
               list.remove(position);
           }
       }
       for(int  i =0; i<list.size(); i++){
           System.out.print(list.get(i) +" ");
       }
    }
}