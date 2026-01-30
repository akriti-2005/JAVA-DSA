package Recursion;
import java.util.*;

public class oneToN{
    public static void print(int n){
        if(n==0){ // base case
            return ;
        }
        print(n-1); //call
        System.out.println(n); //work
    }

    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System .out.println("Enter n: ");
        int n=sc.nextInt();
        print(n);
    }
} 