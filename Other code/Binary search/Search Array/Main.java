import java.util.*;
public class Main
{
    static int FindValue(int arr[], int target){
        int ans = -1;
        int start = 0;
		int end = arr.length-1;
		while(start < end){
		    int mid = start + (end-start)/2;

            if(arr[mid] == target){
                ans = mid;
                break;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid +1;
            }
		    
		}
        return ans;

    }
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5,6,7,9,10};
        int target = 5;
		int ans = FindValue(arr,target);
        System.out.println("position are : "+ans);
	}
	
}