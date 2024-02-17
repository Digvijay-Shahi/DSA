// import java.util.*;
// public class OOPS {
// //     public static void main(String[] args) {
// //          Pen p = new Pen();
// //          p.setcolour("Blue");
// //          System.out.println(p.getClolour());
// //          p.setTip(5);
// //         System.out.println(p.getTip());
// //         p.setcolour("Yellow");
// //          System.out.println(p.getClolour());
// //     }
    
// // }
// // class Pen{
// //     private String color;
// //     private int tip ;
// //     // getter methods
// //     String getClolour(){
// //         return this.color;
// //     }
    
// //     int getTip(){
// //         return this.tip;
// //     }

// //     //setter methods
// //     void setcolour(String newcolor){
// //         this.color = newcolor;

// //     }
// //     void setTip(int newtip){
// //         this.tip = newtip;
// //     }
// //inheritance
// public static void main(String[] args) {
//     Fish f = new Fish();
//     f.eat();
//     f.swim();

// }
// }


// class Animal{
//     String color;
//  void eat(){
//         System.out.println("animal is eating");
//     }
//  void bark (){
//         System.out.println("animal is eating");
//     }

// }
// class Fish extends Animal{
//     int fins;
//  void swim() {
//         System.out.println("Swim");
//     }
// }
// class sit extends Fish{
//      int legs;
// }

//Polymorphis
//metod overloading
    
public class OOPS{
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.sum(10, 0));
        System.out.println(cl.sum((float)1.2,(float)2.4));
        System.out.println(cl.sum(10, 0,4));
    }
}
class Calculator {
    public static int sum(int a , int b) {
        return a+b;
    }
    public static float sum(float a , float b) {
        return a+b;
    }
    public static int sum(int a , int b, int c) {
        return a+b+c;
    }
}