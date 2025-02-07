package Arrays.Array_I;

import java.util.Arrays;

public class insertion_sort {

    public static void insertionS(int arr[]){
        for(int i =0; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println("insertion sort:");
        printArray(arr);
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
       // insertionS(arr);
        Arrays.sort(arr); //5 6 11 12 13
        //Arrays.sort(arr,2,4);//12 11 5 13 6

        //for reverse 
        //Arrays.sort(arr,Collections.reverseOrder()) Integer 
        printArray(arr);

    }
    
}
