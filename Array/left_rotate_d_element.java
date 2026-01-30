import java.util.*;

public class left_rotate_d_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        d = d % n;   // handle d > n

        int temp[] = new int[d];

        // store first d elements
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // shift remaining elements left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // put temp elements at end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
