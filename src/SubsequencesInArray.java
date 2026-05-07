//formula 2^n-1
package src;
import java.util.*;

public class SubsequencesInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int total = (int)Math.pow(2, n);
        for(int i=1;i<total;i++) {
            int temp = i;
            int cnt = 0;
            while (temp > 0) {
                int rem = temp % 2;
                if (rem == 1) {
                    System.out.print(arr[cnt] + " ");
                }
                cnt++;
                temp /= 2;
            }
            System.out.println();
        }
    }
}
