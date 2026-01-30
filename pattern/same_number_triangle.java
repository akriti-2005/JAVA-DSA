// 1
// 22
// 333
// 4444

import java.util.*;
public class same_number_triangle {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of n: ");
        int n=sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for( int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
