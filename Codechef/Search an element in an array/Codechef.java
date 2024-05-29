import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static boolean Findtarget(int arr[],int target){
        int start = 0;
		int end = arr.length-1;
		while(start<=end){
		    int mid = start + (end-start)/2;
		    if(arr[mid] == target){
		        return true;
		        
		    }else if(arr[mid]>target){
		        end = mid-1;
		    }else{
		        start = mid+1;
		    }
		}
		
		return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i<arr.length; i++){
		    arr[i] = sc.nextInt();
		}
		
// 		solution 1  using binary
		Arrays.sort(arr);
		if(Findtarget(arr,target)){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
		
// 		solution 2 using linear search

// 		boolean b = false;
// 		for(int i = 0; i<arr.length; i++){
// 		    if(arr[i]==target){
// 		        b = true;
// 		        break;
// 		    }
// 		}
		
// 		if(b){
// 		    System.out.println("YES");
// 		}else{
// 		    System.out.println("NO");
// 		}
		

	}
}