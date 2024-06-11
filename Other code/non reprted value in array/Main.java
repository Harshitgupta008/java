import java.util.*;

/* 
count non repeted value
Input:1 1 2 2 3 3 4 5 6 7 
Output:4 
*/
public class Main {

    // first trik using HashMap

    // static int CountNonRepeted(int arr[]){
    // int count = 0;
    // HashMap<Integer,Integer> hash = new HashMap<>();
    // int n = 0;
    // while(n<arr.length){
    // if(hash.containsKey(arr[n])){
    // hash.put(arr[n], hash.get(arr[n])+1);
    // }else{
    // hash.put(arr[n],0);
    // }
    // n++;
    // }
    // for(Map.Entry<Integer,Integer> en : hash.entrySet()){
    // if(en.getValue() == 0){
    // count++;
    // }
    // }
    // return count;

    // }

    // Second trik using HashMap
    static int CountNonRepeted(int arr[]) {
        int count = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        int n = 0;
        while (n < arr.length) {
            if (hash.containsKey(arr[n])) {
                count--;
                hash.put(arr[n], hash.get(arr[n]) + 1);
            } else {
                count++;
                hash.put(arr[n], 0);
            }
            n++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 6, 7 };
        System.out.println("Nonrepeted value of count are " + CountNonRepeted(arr));

    }
}
