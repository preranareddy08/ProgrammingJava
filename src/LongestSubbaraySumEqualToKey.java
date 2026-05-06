package src;

import java.util.Scanner;

public class LongestSubbaraySumEqualToKey {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();


        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int maxlen = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n; j++) {
                temp += arr[j];
                if (temp == key) {
                     int len = j-i+1;
                     if(len>maxlen){
                         maxlen = len;
                          start =i;
                          end = j;
                     }

                }
            }
        }
        for(int k=start;k<=end;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
