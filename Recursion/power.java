package Recursion;
import java.util.*;
public class power {
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }else if(a==0){
            return 0;
        }
        else{
            return a*pow(a,b-1);
        }
        
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter b: ");
        int b=sc.nextInt();
        System.out.println(pow(a,b));
    }
    
}
