//print number is positive or not 
package Conditional_statement;
import java.util.*;
public class qus1 {

   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int a=sc.nextInt();
    sc.close();
    if(a>=0){
        System.out.println("positive number");
    }else{
        System.out.println("Negative number");
    }
   } 
}
