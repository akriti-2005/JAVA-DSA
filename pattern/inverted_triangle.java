// *****
// ****
// ***
// **
// *

import java.util.*;
public class inverted_triangle {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n= sc.nextInt();
        sc.close();
        for(int i=1; i<= n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
