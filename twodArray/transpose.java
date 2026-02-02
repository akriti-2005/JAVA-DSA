package twodArray;
import java.util.*;

public class transpose {

    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int arr[][]=new int[n][m];
        int newArr[][]=new int[m][n];
        System.out.println("Enter elements of an array");
        for(int i=0; i<n; i++){
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
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++ ){
                newArr[i][j]=arr[j][i];
            }
        }
       for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(newArr[i][j]+" ");
        }
        System.out.println();
       }
    }
    
}
