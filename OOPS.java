public class OOPS {
    public static void main(String[] args) {
         Pen p = new Pen();
         p.setcolour("Blue");
         System.out.println(p.colour);
         p.setTip(5);
        System.out.println(p.tip);
    }
    
}
class Pen{
    String colour;
    int tip ;
    void setcolour(String newcolour){
        colour = newcolour;

    }
    void setTip(int newtip){
        tip = newtip;
    }
    }
