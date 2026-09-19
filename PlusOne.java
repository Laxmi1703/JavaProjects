import java.util.*;
class PlusOne{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE LENGTH OF NUMBER: ");
    int len = sc.nextInt();
    
    int num[] = new int[len];
    System.out.println("ENTER THE DIGITS: ");

    for(int i = 0; i < len; i++){
    num[i] = sc.nextInt();
    }
    
    for(int i = len - 1; i >= 0; i--){
      if(num[i] < 9 && i == (len-1)){
        num[i] = num[i] + 1;
      }else if(num[i] == 9 && i == len-1 && i != 0){
        num[i-1] = num[i-1] + 1;
        num[i] = 0;
      }else if(num[i] > 9 && (i!=0)){
        num[i] = 0;
        num[i-1] = num[i-1] + 1;
      }
    }
    System.out.println("THE NEW NUM IS: ");
    for(int i = 0; i < len; i++){
        System.out.print(num[i]);
    }
    sc.close();
    }
}