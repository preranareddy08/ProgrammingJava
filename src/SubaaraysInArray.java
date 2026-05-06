package src;
import java.util.*;

class SubaaraysInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid");
            return;
        }

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            String temp = "";

            for (int j = i; j < n; j++) {
                temp += arr[j] + " ";
                System.out.println(temp);
            }
        }
    }
}
