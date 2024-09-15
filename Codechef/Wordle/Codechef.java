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
		sc.nextLine();
		while(n>0){
		    String str1 = sc.nextLine();
		    String str2 = sc.nextLine();
		    
		    String arr1[] = str1.split("");
		    String arr2[] = str2.split("");
		    int i = 0;
		    int j = 0;
		    String answer = "";
		    while(i<arr1.length && j<arr2.length){
		        if(arr1[i].equals(arr2[j])){
		            answer = answer.concat("G");
		        }else{
		            answer = answer.concat("B");
		        }
		        i++;
		        j++;
		    }
		    while(i<arr1.length){
		        answer = answer.concat("B");
		        i++;
		    }
		    while(j<arr1.length){
		        answer = answer.concat("B");
		        j++;
		    }
		    System.out.println(answer);
		    n--;
		}

	}
}