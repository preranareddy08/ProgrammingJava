package src;//14.write a program to print k times repeated element in an array.

import java.util.*;

class KtimesRepeatedElements {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int k = sc.nextInt();
       
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       
       for(int i=0;i<n;i++){
           int lc = 0;
           for(int j=i;j>=0;j--){
               if(arr[j]==arr[i]){
                   lc++;
               }
           }
           if(lc==1){
               int oc = 0;
               for(int j=0;j<n;j++){
                   if(arr[j]==arr[i]) oc++;
               }
               if(oc==k) System.out.print(arr[i]+" ");
           }
            
       }
    }
}