package loops;
import java.util.*;
public class sum_n_natural {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=1;
        while (count<=n) {
            sum=sum+count;
            count++;
            sc.close();
        }
        System.out.println(sum);
    }
    
    
}

