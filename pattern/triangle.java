// *
// **
// ***
// ****
import java.util.*;
public class triangle {
    public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int n=sc.nextInt();
    
    sc.close();
    for(int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println( );
    }
    }
}
