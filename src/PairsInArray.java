package src;//Write a program to print same number pairs in given array

import java.util.*;
class PairsInArray{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
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
			   if(lc%2==0){
				   int rc = 0;
				   for(int j=i+1;j<n;j++){
					   rc++;
				   }
				   if(rc>1){
					   System.out.println(arr[i]+" "+arr[i]);
				   }
			   }
		   }   
	}
}
	   