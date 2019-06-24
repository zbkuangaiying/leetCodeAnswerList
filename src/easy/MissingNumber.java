package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-24 上午11:22:55
 * @ClassName 类名称
 * @Description 类描述
 */
public class MissingNumber extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[]{0,1,3,2,4,5,8,7,9}));
	}
	
    public static int missingNumber(int[] nums) {
    	
    	
//        int result = 0;
//        for (int i = 0; i <nums.length; i++) {
//			result=i+result-nums[i];
//		}
//        return result+nums.length;
    	
    	
    	  int res = 0;
          for(int i = 0; i < nums.length; i++){
//        	  int a = res^nums[i];
//        	  int b = a ^ (i+1);
              res = res ^ nums[i] ^ (i + 1);
//        	  res = b;
          }
          return res;
    }

}
