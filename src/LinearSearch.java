package src;
import java.util.*;

public class LinearSearch {
    static boolean linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target) return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int target = sc.nextInt();

        boolean res = linearSearch(arr, target);

        if(res) System.out.println("element found");
        else System.out.println("element not found");

    }
}
