import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6,7,9,10};
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		while(start < end){
		    int mid = start + (end-start)/2;
		    int diff = arr[mid]-mid;
		    if(diff == 1){
		        start = mid+1;
		    }else if(diff == 2){
		        end = mid-1;
		        ans = mid;
		    }
		}
		System.out.println(ans+1);
	}
	
}