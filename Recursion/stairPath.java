package Recursion;
import java.util.*;
public class stairPath {
    public static int path(int n){
        if(n<3){
            return n;
        }else{
            return path(n-1)+path(n-2);
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n : ");
        int n= sc.nextInt();
        System.out.println(path(n));
    }
    
}
