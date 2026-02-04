package twodArray;

import java.util.Scanner;

public class multi {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        int brr[][]=new int[n][m];
        int crr[][]=new int[m][m];
        System.out.println("Enter the first matrix");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                brr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                for(int k=0; k<n; k++){
                    crr[i][j]+=arr[i][k]*brr[k][j];
                   
                }
                
            }
           
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                 System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
