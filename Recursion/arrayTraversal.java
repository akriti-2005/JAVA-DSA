package Recursion;

public class arrayTraversal {

    public static void print(int i, int[] arr){
        if(i>arr.length){
            return ;
        }
        //System.out.print(i+" ");
        System.out.println(arr[i]+" ");
        print(i+1, arr);
    }

    public static void main(String[] args){
       int arr[]={1,2,3 ,4,5};
       //for(int ele:arr){
       //for(int i=0; i<arr.length; i++){
        // System.out.println(ele+" ");
         //System.out.println(arr[i]+" ");
       //}
       //System.out.println();
       print(0,arr);
    }
    
}
