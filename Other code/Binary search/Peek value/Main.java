// find the peek value in the mauntain array
public class Main
{
    static int PeekValue(int arr[]){
        int ans = 0;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            
            if( arr[mid+1] < arr[mid]  && arr[mid] > arr[mid-1]){
                ans = mid;
                break;
            }else if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    // optimize solution
    static int newPeekValue(int arr[]){
        int start = 0;
        int end = arr.length-1;
     
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
       
        return start;
    }
	public static void main(String[] args) {
		int arr[] = {10,20,40,50,30};
		int ans = PeekValue(arr);
		int ans2 = newPeekValue(arr);
		System.out.println(ans);
		System.out.println(ans2);
	}
}