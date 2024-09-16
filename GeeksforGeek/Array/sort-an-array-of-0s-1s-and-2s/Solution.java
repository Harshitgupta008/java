import java.util.*;
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(ArrayList<Integer> arr) {
        // code here
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int val : arr){
            if(val == 0){
                zero++;
            }else if(val == 1){
                one++;
            }else{
                two++;
            }
        }
        int i = 0;
        
        while(zero>0){
            arr.set(i,0);
            zero--;
            i++;
        }
        while(one>0){
            arr.set(i,1);
            one--;
            i++;
        }
        while(two>0){
            arr.set(i,2);
            two--;
            i++;
        }
        
    }
}