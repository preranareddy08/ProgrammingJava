//subarray sum equals to k
package src;
import java.util.*;

public class SubarraysSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            int temp = 0;
            for(int j=i;j<n;j++){
                temp+=arr[j];
                if(temp==key){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
