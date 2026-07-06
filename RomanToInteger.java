import java.util.*;
public class RomanToInteger {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in); 
       System.out.println("ENTER A ROMAN VALUE: ");
       String s = sc.nextLine();
        int number = 0;
        for(int i = 0; i < s.length(); i++){
          char initialChar = s.charAt(i);
          int val1 = 0;
          int val2 = 0;
          switch(initialChar){
          case 'I':
             val1 = 1;
             break;
          case 'V':
             val1 = 5;
             break;
          case 'X':
             val1 = 10;
             break;
          case 'L':
             val1 = 50;
             break;
          case 'C':
             val1 = 100;
             break;
          case 'D':
             val1 = 500;
             break;
          case 'M':
             val1 = 1000;
             break;
            }
        
          if(i + 1 < s.length()){
            char nextChar = s.charAt(i + 1);
            switch(nextChar){
          case 'I':
             val2 = 1;
             break;
          case 'V':
             val2 = 5;
             break;
          case 'X':
             val2 = 10;
             break;
          case 'L':
             val2 = 50;
             break;
          case 'C':
             val2 = 100;
             break;
          case 'D':
             val2 = 500;
             break;
          case 'M':
             val2 = 1000;
             break;
          }

          }
          if(val1 > val2){
             number += val1;
          }else if(val1 == val2){
             number += val1;
          }else{
            number -= val1;
          }
        }
        System.out.println("THE CONVERTED VALUE IS: " + number);
    sc.close();
    }
}
    

