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

    public static int fact(int n){
        if (n == 0 ){
            return 1;
        }
        int f1= fact(n-1);
        int f = n * f1;
        return f;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
}
