package merge;

public class quickSort {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int pivotIdx = low;
        int smallerCount = 0;

        for(int i = low + 1; i <= high; i++){
            if(arr[i] <= pivot){
                smallerCount++;
            }
        }

        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx);

        int i = low;
        int j = high;

        while(i < correctIdx && j > correctIdx){
            if(arr[i] <= pivot){
                i++;
            } else if(arr[j] > pivot){
                j--;
            } else {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }

    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int idx = partition(arr, low, high);
        sort(arr, low, idx - 1);
        sort(arr, idx + 1, high);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 6, 9, 4};
        sort(arr, 0, arr.length - 1);

        // Print sorted array
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}