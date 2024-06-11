public class Main {
    static int Position(int target,int arr[]){
        int position = -1;
        int start = 0;
        int end = arr.length-1;;
        int n = 0;
        
        while(n<arr.length){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            n++;
        }
        return position;
    }
    public static void main(String[] args) {
        int target = 5;
        int arr[] = {1,2,4,5,6,8,10,12};
        System.out.println(Position(target,arr));
    }
    
}
