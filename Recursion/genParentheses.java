package Recursion;

import java.util.Scanner;

public class genParentheses {

    public static void print(int o,int c, int n,String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(o<n) print(o+1,c,n,s+"(");
        if(c<o) print(o,c+1,n,s+")");
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc. nextInt();
        print(0,0, n, "");
    }
    
}
