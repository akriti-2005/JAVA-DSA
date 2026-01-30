
//doubt
package loops;
//print the sum of even odd numbers
import java.util.*;
public class qus2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int evenSum=0;
        int oddSum=0;
        System.out.println("Enter a number:");
        int number=sc.nextInt();
    do{
        if(number%2==0){
            evenSum+=number;
        }else{
            oddSum+=number;
        }
    }while(number>0);
    System.out.println(evenSum);
    System.out.println(oddSum);
       sc.close();
}

}
