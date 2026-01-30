import java.util.*;
public class missing {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=1; i<=n; i++){
        //    int flag=0;
        //    for(int j=0;j<n-1;j++){
        //     if(arr[i]==i){
        //         flag=1;
        //         break;
        //     }
        //    }
        //    if(flag==0){
        //     System.out.print(i);
        //    }
        // }



    int sum=n*(n+1)/2;
    int sum1=0;
    for(int i=0; i<n-1;i++){
        sum1+=arr[i];
    }
    int missing=sum-sum1; 
    System.out.print(missing);
    sc.close();
    }
    
}
