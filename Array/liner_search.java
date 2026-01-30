
import java.util.Scanner;

public class liner_search {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int key=sc.nextInt();
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                System.out.println(arr[i]);
                sc.close();
            }
        }
    }
    
}
