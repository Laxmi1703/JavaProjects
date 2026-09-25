import java.util.*;
class Solution {
    public static boolean isPalindrome(String s) {
       StringBuilder s1 = new StringBuilder();
       if(s == " "){
        return true;
       }
       for(int i = 0; i < s.length(); i++){
         char c = s.charAt(i);
         if(Character.isLetterOrDigit(c)){
            s1.append(Character.toLowerCase(c));
         }
       }
       for(int i = 0; i < (s1.length()/2); i++){
          if(s1.charAt(i) != s1.charAt((s1.length()-1)-i)){
            return false;
          }
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING: ");
        String s = sc.nextLine();
        boolean b = isPalindrome(s);
        if(b == true){
            System.out.println(" STRING IS PALINDROME");
        }else{
            System.out.println("STRING IS NOT A PALINDROME");
        }
    sc.close();
    }
}