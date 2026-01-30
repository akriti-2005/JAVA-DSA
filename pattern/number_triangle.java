

// 1
// 12
// 123
 import java.util.*;
 public class number_triangle {
     public static void main(String arg[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         sc.close();
         for(int i=1; i<=n; i++){
             for(int j=1; j<=i; j++){
                 System.out.print(j);
             }
             System.out.println();
         }
 
     }
     
 }
 
 
 

