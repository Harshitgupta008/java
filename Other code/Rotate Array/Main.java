
public class Main {

    static void RotateArray(int arr[], int k) {
        int i = 0;
        while (i < k) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            start = 1;
            end = arr.length - 1;

            while (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            i++;
        }
        System.out.print("Rotate output are : ");
        for(int j : arr){
            System.out.print(j+",");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray(arr,k);
    }
}
