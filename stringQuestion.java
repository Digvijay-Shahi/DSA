public class stringQuestion {

    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0 ; i< str.length()/2; i++){
            
            if (str.charAt(i)!=str.charAt(n-i-1)){
                System.out.println("it is not a palindrome");
                return false;
            }
        }
        System.out.println("it is a palindrome");
        return true;
    }
    public static void main(String args[]){
        String str = "11110";
        isPalindrome(str);

    }

}
