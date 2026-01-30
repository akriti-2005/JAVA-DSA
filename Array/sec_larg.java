
import java.util.*;
public class sec_larg {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int largest=0;
        int sec_larg=-1;
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
             largest=arr[i];
            }
        }
        
        
        for(int i=0; i<n; i++){
            if(arr[i]>sec_larg&& arr[i]!=largest  ){
                sec_larg=arr[i];

            
            
            }
               
            
        }

        System.out.println(sec_larg);
        sc.close();
    }
    
}
