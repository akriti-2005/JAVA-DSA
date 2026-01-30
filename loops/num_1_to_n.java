package loops;
import java.util.*;
public class num_1_to_n {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number : ");
    int n=sc.nextInt();
    sc.close();
    int counter=1;
    while(counter<=n){
        System.out.println(counter+ " ");
        counter++;
    }
    System.out.println();
  }  
}
