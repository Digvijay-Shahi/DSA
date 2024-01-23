public class stringQuestion {
    //Palindrome

    // public static boolean isPalindrome(String str){
    //     int n = str.length();
    //     for (int i = 0 ; i< str.length()/2; i++){
            
    //         if (str.charAt(i)!=str.charAt(n-i-1)){
    //             System.out.println("it is not a palindrome");
    //             return false;
    //         }
    //     }
    //     System.out.println("it is a palindrome");
    //     return true;
    // }
    // public static void main(String args[]){
    //     String str = "11110";
    //     isPalindrome(str);

    // }


    // shortest path question

    public static float shortestPath(String path){
        int x = 0 , y= 0;
        for (int i = 0 ; i < path.length(); i++){
            char dir = path.charAt(i); 
            if (dir=='S'){
                x--;
            }
            else if (dir=='N') {
                x++;
            }
            else if (dir=='W') {
                y--;
            }
            else{
                y++;
            }
           
            

        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }
        public static void main(String args[]){
            String path = "NNSESWWNS";
            System.out.println(shortestPath(path));
        }

}
