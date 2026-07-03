import java.util.*;
public class DecimalToBinary{
    public static void decimalToBinary(int n){
    
    int rem = 0;
    int digit = 1;
    int num = 0;
    while(n > 0){
     rem = n % 2;
     n = n / 2;
     num = num + rem * digit;
     digit = digit * 10;
    }
    System.out.println("THE BINARY NUMBER IS: " + num);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A DECIMAL NUMBER TO CONVERT: ");
    int n = sc.nextInt();
    decimalToBinary(n);
    sc.close();
}
}
