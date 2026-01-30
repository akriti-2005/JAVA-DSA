import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        sc.close();
        float total=pencil+pen+eraser;
        System.out.println(total);
        /*Add 18% tax */
        float new_total=total+(0.18f + total);
        System.out.println(new_total);
    }
    
}
