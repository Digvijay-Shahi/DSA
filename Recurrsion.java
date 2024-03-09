public class Recurrsion {
    // public static void printNum(int n) {
    //     if(n ==1){
    //         System.out.println("1");
    //         return;
    //     }
    //     System.out.println(n);
    //     printNum(n-1);
    // }
    
    // public static void main(String[] args) {
    //     int i = 10;
    //     printNum(i);
    // }

    // public static void printNum(int n) {
    //     if(n ==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    
    //     printNum(n-1);
    //     System.out.print(n+" ");
    // }
    
    // public static void main(String[] args) {
    //     int i = 10;
    //     printNum(i);
    // }

    // public static int fact(int n){
    //     if (n == 0 ){
    //         return 1;
    //     }
    //     int f1= fact(n-1);
    //     int f = n * f1;
    //     return f;
    // }

    // public static int sumNatural(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int s= sumNatural(n-1);
    //     int sum = n + s;
    //     return sum;
    // }

    // public static int fact(int n){
    //     if (n == 0 || n == 1){
    //         return n;
    //     }
    //     int f1= fact(n-1);
    //     int f2 = fact(n-2);
    //     int f = f1 +f2;
    //     return f;
    // }


    // public static boolean isSorted(int arr[], int i){
    //    if (i == arr.length-1){
    //     return true;
    //    }
    //     if (arr[i]> arr[i+1]){
    //         return false;
    //     }
    //     return isSorted(arr, i+1);
    // } 

//     public static int firstOccurance(int arr[], int key, int i){
//         if (i==arr.length){
//             return -1;
//         }
//         if (arr[i] == key){
//             return i;
//     }
//    return firstOccurance(arr, key, i+1);
//     }

// public static int lastOccurance(int arr[], int key, int i){
//       if (i == arr.length){
//         return -1;
//       }
//       int isfound = lastOccurance(arr, 5, i+1);
//       if(isfound == -1 && arr[i]==key){
//         return i;
//       }
//       return isfound;
// }

// public static int power(int x , int n){
//     if (n == 1){
//         return x;
//     }
//     int a = power(x, n-1);
//     int ans = x * a;
//     return ans;
// }

public static int power(int a, int n){
    if (n == 0){
        return 1;
    }

    int halfpower =   power(a, n/2) * power(a, n/2);
    if (n % 2 != 0){
        halfpower  = a * halfpower;
    }
    return halfpower;
} 
    public static void main(String[] args) {
        // int n = 25;
        // System.out.println(fact(n));
        // int arr[] = {1,2,5,4,3,4,5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 5 ,0));
        System.out.println(power(2, 2));
    }
}
 