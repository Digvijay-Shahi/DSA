public class bitManipulation {
    //Even and odd

    // public static void evenodd(int n){
    //     int bitmask =1;
    //     if ((n & bitmask)==0){
    //         System.out.println("it is is even number");
    //     }else{
    //         System.out.println("it is ia a odd number");
    //     }
    // }

    // getting the bit

//     public static int getBit(int n , int i) {
//         int bitmask = 1<<i;
//         if ((n & bitmask)==0){
//             return 0;
//     }else{
//         return 1;
//     }
// }
// setting the bit 
    
    public static int setBit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    // clearing the bit

    public static int clearBit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    //updating the bit 

    public static int upadateBit(int n , int i , int pos){
        if(pos == 0){
           return clearBit(n, i);
        }
        else {
            return setBit(n, i);
        }
    }
    public static void main(String args[]){
        // System.out.println((5&7));
        // System.out.println((5|7));
        // System.out.println((5^7));
        // System.out.println((~0));
        // System.out.println((5>>2));
        // System.out.println((5<<2));
        // evenodd(30);
        // System.out.println(getBit(10, 2));
        // System.out.println(setBit(10, 2));
        // System.out.println((clearBit(10, 1)));
        System.out.println((upadateBit(10, 2, 1))); 

    }
}

