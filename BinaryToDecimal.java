import java.util.*;
public class BinaryToDecimal {
    public static void binaryToDecimal(int n){
    int rem = 0;
    int i = 1;
    int dec = 0;

    while(n > 0){
        rem = n % 10;
        n = n / 10;
        dec = dec + rem * i;
        i = i * 2;
    }
        System.out.println("THE VALUE IN DECIMAL IS: " + dec);
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER A BINARY NUMBER TO CONVERT: ");
    int num = sc.nextInt();
    binaryToDecimal(num);

    sc.close();
    }
}
