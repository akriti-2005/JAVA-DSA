import java.util.Scanner;

public class sum {
    public static int add(int a, int b){
        int result=a+b;
        return result;
    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        sc.close();
        int result= add(a, b);
        System.out.println(result);
    }
    
}
