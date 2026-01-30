import java.util.*;
public class right_rotate_1 {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=1; i<=n; i++){
            arr[i]=arr[i-1];
            
        }
        arr[0]=temp;
       
        for(int i=1;i<=n; i++){
            System.out.println(arr[i-1]);
            sc.close();
        }
    }
}

//DOUBT