// A
// AB
// ABC

import java.util.*;
public class character_triangle {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        // char j='A';
        for(int i= 1; i<=n; i++){
            for (char j='A'; j<'A'+i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
