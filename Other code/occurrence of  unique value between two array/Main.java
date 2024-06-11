import java.util.*;

/*
Input: a = 1 2 3 4 5     b  = 1 2 3       Output: 5 
*/
public class Main {
    static int OccurrenceUniqueValue(int a[], int b[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int ele : a){
            hs.add(ele);
        }
        for(int ele : b){
            hs.add(ele);
        }
        return hs.size();
    }
    public static void main(String[] args) {
        int a[] =  {1,2,3,4,5};
        int b[] =  {1,2,3};
        System.out.println("Occurrence are : "+ OccurrenceUniqueValue(a,b));

    }
}
