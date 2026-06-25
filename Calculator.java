
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A VALUE FOR 'A'. ");    
        int a = sc.nextInt();
        System.out.println("ENTER A VALUE FOR 'B'. ");
        int b = sc.nextInt();
        System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM. ");
        System.out.println("CHOOSE FROM '+', '-', '*', '/','%'");
        char ch = sc.next().charAt(0);
         
        if(ch == '+'){
            System.out.println("THE SUM IS: " + (a + b));
        }
        else if(ch == '-'){
            System.out.println("THE DIFFERENCE IS: ");
            if(a > b){
                System.out.println(a - b);
            }else{
                System.out.println(b - a);
            }
        }
        else if(ch == '*'){
            System.out.println("THE PRODUCT IS: " + (a*b));
        }
        else if(ch == '/'){
            System.out.println("THE QUOTIENT IS: ");
            if(a > b){
                System.out.println(a / b);
            }else{
                System.out.println(b / a);
            }
        }
        else if(ch == '%'){
            System.out.println("THE REMAINDER IS: ");
            if(a > b){
                System.out.println(a % b);
            }else{
                System.out.println(b % a);
            }
        }
        else{
            System.out.println("PLEASE CHOOSE VALID OPERATOR !");
        }

    }
    
}
