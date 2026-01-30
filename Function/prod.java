import java.util.Scanner;


public class prod{
    public static int multiply(int a, int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int prod=multiply(a,b);
        System.out.println(prod);
        }
}