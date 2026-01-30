import java.util.*;


public class remove_duplicate {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        // for(int i=1; i<n; i++){
            
        //     if(arr[i]>=arr[i-1]){
        //         i++;
                
        //     }
        //     System.out.println(arr[i+1]);
            
        // }
        // //  System.out.println(i+1);
        //  sc.close();
        int i=0;
        for(int j=1; j<n; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
     }
   
}  

//DOUBT
