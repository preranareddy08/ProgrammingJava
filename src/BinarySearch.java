package src;
import java.util.*;

public class BinarySearch {
    static int binarySearch(int arr[], int target){
        int l = 0, r = arr.length;
        while(l<=r){
            int mid = (l + (r-l))/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) l = mid-1;
            else r = mid+1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int target = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("element found at index : "+binarySearch(arr, target));
    }
}
