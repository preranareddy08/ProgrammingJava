package src;//check if given array is sorted or not

import java.util.*;

class SortedArray{
	public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int arr[] = new int[n];
		 for(int i=0;i<n;i++){
			 arr[i] = sc.nextInt();
		 }
		 
		 boolean isTrue = false;
		 
		 for(int i=0;i<n;i++){
			 for(int j=i+1;j<n;j++){
				 if(arr[j]<arr[i]){
					 isTrue = true;
				 }
			 }
		 }
		 if(isTrue) System.out.print("not sorted");
		 else System.out.print("sorted");
		 
		 
	}
}