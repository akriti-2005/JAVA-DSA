package Recursion;

import java.util.Scanner;

public class mazePath {

    // public static int path(int row, int col, int n, int m) {

    //     // out of boundary
    //     if (row > n || col > m) {
    //         return 0;
    //     }

    //     // destination reached
    //     if (row == n && col == m) {
    //         return 1;
    //     }

    //     int rightWays = path(row, col + 1, n, m);
    //     int downWays = path(row + 1, col, n, m);

    //     return rightWays + downWays;
    // }

    public static int maze(int m, int n){
        if(m==1 || n==1){
            return 1;
        }
        int rightWays=maze(m,n-1);
        int downWays=maze(m-1, n);
        return rightWays+downWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (rows): ");
        int n = sc.nextInt();

        System.out.print("Enter m (cols): ");
        int m = sc.nextInt();

       // System.out.println(path(1, 1, n, m));
       System.out.println(maze(m,n));
    }
}