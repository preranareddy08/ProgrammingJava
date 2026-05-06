package src;//12.write a program to print duplicates in the given array.
import java.util.*;

class DuplicatesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int lc = 0;
            for (int j = i; j >= 0; j--) {
                if (arr[j] == arr[i]) {
                    lc++;
                }
            }
            if (lc == 1) {
                int oc = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == arr[i]) oc++;
                }
                if (oc > 1) System.out.print(arr[i] + " ");
            }
        }
    }

}