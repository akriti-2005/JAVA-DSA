package loops;
import java.util.*;
public class rev_of_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        sc.close();
        while(n>0){
            int last_digit=n%10;
            System.out.print(last_digit+" ");
            n=n/10;

        }
    
    }


}
 