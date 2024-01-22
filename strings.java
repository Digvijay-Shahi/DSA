import java.util.Scanner;

public class strings {
    public static void main(String args[]){
        String name =  "digvijay";
        String lastName = new String("shahi");
        Scanner sc = new Scanner(System.in);
        
        String intro;
        // intro = sc.next(); Single Word as input
        intro = sc.nextLine();// all the content 

       
        System.out.println(name);
      
        System.out.println(lastName);
        System.out.println(intro+" "+ name+" " +lastName );
    }
}
