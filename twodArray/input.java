package twodArray;

import java.util.Scanner;

public class input {

    public static void main(String[] ards){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j]=sc.nextInt();
            }
        }
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(arr[i][j]+" ");
        }
       System.out.println();
       }
    }
    
}
