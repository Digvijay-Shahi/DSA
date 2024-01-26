import java.util.Scanner;
import java.util.*;

public class strings {
    public static void main(String args[]){
        // String name =  "digvijay";
        // String lastName = new String("shahi");
        // Scanner sc = new Scanner(System.in);
        
        // String intro;
        // intro = sc.next(); Single Word as input
        // intro = sc.nextLine();// all the content 

       
        // System.out.println(name);
      
        // System.out.println(lastName);
        // System.out.println(intro+" "+ name+" " +lastName );


        // String a = "Tony";
        // String b = "Tony";
        // String c =  new String("Tony");
        // // if (a==c){
        // //     System.out.println("String is equal");
        // // }
        // // else{
        // //     System.out.println("String is not equal");
        // // }
        //      if (a.equals(c)){
        //     System.out.println("String is equal");
        // }
        // else{
        //     System.out.println("String is not equal");
        // }(

     
// String str = "HelloWorld";
// System.out.println(str.substring(1,4));


// System.out.println(sub(str, 1,4));

        //     String fruits[] ={"apple","mango", "orange"};
        //     String largest = fruits[0];
        //     for(int i= 0 ; i < fruits.length; i++){
        //         if(largest.compareTo(fruits[i])<0){
        //             largest = fruits[i];
        //         }
        //     }
        //     System.out.println(largest);
        // }
// public static String sub(String str, int si, int ei ){
//     String Sub= "";
//     for(int i = si ; i<ei; i++){
//         Sub += str.charAt(i);
//     }

// return Sub;
// }

// String Builder

StringBuilder a = new StringBuilder("");
for (char i = 'a'; i < 'z'; i++){
    a.append(i);
}
    System.out.println(a);

}
}
