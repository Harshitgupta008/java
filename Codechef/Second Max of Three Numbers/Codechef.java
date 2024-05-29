import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
		    int arr[] = new int[3];
		    for(int i = 0; i<arr.length; i++){
		        arr[i] = sc.nextInt();
		    }
		    int first = Integer.MIN_VALUE;
		    int second = Integer.MIN_VALUE;
		    for(int i=0; i<arr.length; i++){
		        if(arr[i]>first){
		            second = first;
		            first = arr[i];
		        }else if(arr[i]>second && first>second){
		            second = arr[i];
		        }
		    }
		    System.out.println(second);
		    n--;
		}

	}
}