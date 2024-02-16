public class OOPS {
//     public static void main(String[] args) {
//          Pen p = new Pen();
//          p.setcolour("Blue");
//          System.out.println(p.getClolour());
//          p.setTip(5);
//         System.out.println(p.getTip());
//         p.setcolour("Yellow");
//          System.out.println(p.getClolour());
//     }
    
// }
// class Pen{
//     private String color;
//     private int tip ;
//     // getter methods
//     String getClolour(){
//         return this.color;
//     }
    
//     int getTip(){
//         return this.tip;
//     }

//     //setter methods
//     void setcolour(String newcolor){
//         this.color = newcolor;

//     }
//     void setTip(int newtip){
//         this.tip = newtip;
//     }
//inheritance

public static void main(String[] args) {
    Fish f = new Fish();
    f.eat();
}
class Animal{
 void eat(){
        System.out.println("animal is eating");
    }
 void bark (){
        System.out.println("animal is eating");
    }

}
class Fish extends Animal{
 void swim() {
        System.out.println("Swim");
    }

}
    }
