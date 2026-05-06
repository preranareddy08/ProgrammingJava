//left shift and right shift of array n times
package src;
import java.util.*;

public class CircularArray {
    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Clockwise(int arr[], int k){
        int n = arr.length;
        int t = 0;
        while(t<k){
            int temp = arr[n-1];
            for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;

           // System.out.println("n ="+n);
            display(arr);
            System.out.println();

            t++;
        }
    }
    static void AntiClockwise(int arr[], int k){
        int n = arr.length;
        int t = 0;
        while(t<k){
            int temp = arr[0];
            for(int i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;

            //System.out.println("n ="+ n);
            display(arr);
            System.out.println();

            t++;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n;

        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        System.out.println("clockwise:");
        Clockwise(arr, k);

        System.out.println();

        System.out.println("Anticlockwise");
        AntiClockwise(arr, k);
    }
}
