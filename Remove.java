import java.util.*;
public class Remove{
    
    //Counts elements not equal to Val
    public static int numVal(int[] nums, int val){
        int numNE = 0;
        for(int i = 0; i < nums.length; i++){
               
        if(nums[i] != val){
           numNE++;
        }
     }
     return numNE;
    }

    //Modifies array
    public static int[] arrVal(int[] nums, int val){
        int k = numVal(nums, val);
        int[] num1 = new int[k];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
          if(nums[i] != val){
            num1[index] = nums[i];
            index++;
          }
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY: ");
        int size = sc.nextInt();
       
        int[] nums = new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY: ");
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        
        System.out.println("ENTER THE ELEMENT TO BE REMOVED: ");
        int val = sc.nextInt();

        System.out.println("NUMBER OF ELEMENT NOT EQUAL TO VAL: " + numVal(nums, val) + "\n" + "NEW ARRAY IS: " + Arrays.toString(arrVal(nums, val)));
   
        sc.close();
    }
}