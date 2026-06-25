import java.util.*;
public class Compare {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER A VALUE FOR 'a'. ");
        int a = sc.nextInt();
        System.out.println("ENTER A VALUE FOR 'b'. ");
        int b = sc.nextInt();

        if(a == b){
            System.out.println("BOTH ARE EQUAL !!");
        }
        else if(a > b){
            System.out.println("'a' IS GREATER THAN 'b' !!");
        }else{
            System.out.println("'b' IS GREATER THAN 'a' !!");
        }
        sc.close();
    }    
}
