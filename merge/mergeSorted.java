package merge;

import java.util.Arrays;

public class mergeSorted {
    // public static void print(int[] a, int[] b, int[] c){
    //    int i=0;
    //    int j=0;
    //    int k=0; 
    //    while(i<a.length&& j<b.length){
    //     if(a[i]<=b[j]){
    //         c[k]=a[i];
    //         i++;
    //         k++;
    //     }else{
    //         c[k]=b[j];
    //         j++;
    //         k++;
    //     }
    //    }
    //    while(i<a.length){
    //     c[k]=a[i];
    //     i++;
    //     k++;
    //    }
    //    while(j<b.length){
    //     c[k]=b[j];
    //     j++;
    //     k++;
    //    }
    // }

    // public static void main(String[] args){
    //     int[] a={10,20,30,40};
    //     int[] b={21,42,72,84};
    //     int[] c=new int[a.length+b.length];
    //      print(a,b,c);
    //     System.out.println(Arrays.toString(c));
    // }

    //using recusion

    public static void merge(int[] arr){
        int n=arr.length;
        if(n==1){
            return;
        }
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        //copy
        for(int i=0; i<n/2; i++){
            a[i]=arr[i];
        }
        for(int i=0; i<n-n/2; i++){
            b[i]=arr[i+n/2];
        }

        merge(a);
        merge(b);
     //   merge(a,b,arr);
    }
    
}


