package loops;
import java.util.*;
public class rev_given_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number " );
        int n=sc.nextInt();
        sc.close();
        int rev=0;
        while(n>0){
            int last_digit=n%10;
            rev=(rev*10)+last_digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}
