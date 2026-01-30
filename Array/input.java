

import java.util.*;
public class input {
    public static void main(String arg[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter array size: ");
       int n= sc. nextInt();
       int arr[]=new int[n];
       System.out.println("Enter array element: ");
       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();//taking iput from user
        
       }
        System.out.println("Array elements: ");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        sc.close();
       }
    }
    
}
