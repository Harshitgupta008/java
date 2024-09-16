
import java.io.*;
import java.util.*;
import java.util.stream.*;


class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int leader = 0;
        int end = arr.length-1;
        while(end>=0){
            if(end == arr.length-1){
                leader = arr[end];
                list.add(arr[end]);
            }else if(arr[end] > leader || arr[end] == leader){
                leader = arr[end];
                list.add(arr[end]);
            }
            
            end--;
        }
        Collections.reverse(list); 
        return list;
    }
}