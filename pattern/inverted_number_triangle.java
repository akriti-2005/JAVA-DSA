// 1234
// 123
// 12
// 1

import java.util.*;
public class inverted_number_triangle {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
