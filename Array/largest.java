
import java.util.*;
public class largest {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        
        }
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        
        }
        System.out.println(largest);
        sc.close();
    }
    
}
