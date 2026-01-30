import java.util.*;
public class inverted_char_triangle {
    public static void main(String arg[]){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++){
            for (int j='A'; j<='A'+(n-i-1);j++){
                System .out.print(j);
            }
            System.out.println();
        }
        }
}
//DOUBT