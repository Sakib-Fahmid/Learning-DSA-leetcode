import java.util.Arrays;
import java.util.Scanner;
class TwoSum {
    public static void main(String[] args){
      Scanner scanner =new Scanner(System.in);
      System.out.println("Please enter array size !");
      int arrayLength = scanner.nextInt();
      int numbers [] =new int [arrayLength];
      System.out.println("Please enter array elements !");
      for(int i=0;i<=arrayLength-1;i++){
        numbers[i]=scanner.nextInt();
      }
      System.out.println("Please enter target value !");
      int target = scanner.nextInt();
        TwoSum obj = new TwoSum();
        int [] result = obj.twoSum(numbers,target);
        System.out.println("Target value found in :"+Arrays.toString(result));
    }
    public int[] twoSum(int[] nums, int target) {
      
      int resultArray [] = new int [2];
      outerloop :
      for(int i=0; i<nums.length-1;i++) {	
    	  for(int j=1; j<=nums.length-1;j++) {
    		  if(nums[i]+nums[j] == target && i != j) {
    			  // && condition added so that i and j value are never the same
    			  // ie : in case of nums[] = [2,5,5,11] and target = 10 
    			  // result[] = [1,1], which is a wrong answer
    			  resultArray[0]= i;
    			  resultArray[1]= j;
    			  break outerloop;
    		  }
    	  }
      }
      return resultArray;
    }
}