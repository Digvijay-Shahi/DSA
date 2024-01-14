import java.util.*;

public class Sorting {

    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++ ){
            for (int j= 0 ; j < arr.length-1-i; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                 } 
            }
        }
    }
    public static void selectionSort(int arr[]){
       
        for(int i = 0 ; i< arr.length- 1; i++){
             int minPos = i;
            for (int j = i+1 ; j< arr.length; j++){
                if(arr[minPos]> arr[j] ){
                    minPos= j;
                }
            }
            int temp = arr[minPos];
            arr[minPos]= arr[i];
            arr[i]= temp;
        }
    }

    public static void intereationSort(int arr[]){
        for (int i = 1 ; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev>= 0 && arr[prev]>curr) {
                 arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] =curr;
        }
    }

    public static void arrPrint(int arr[]){
        for (int i = 0 ; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("");
    }
    public static void main (String args[]){
        int arr[] = {4,1,3,5,6};
        // bubbleSort(arr);
        // selectionSort(arr);
        intereationSort(arr);
        arrPrint(arr);

     }
}
