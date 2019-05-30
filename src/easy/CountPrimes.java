package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-5-30 上午9:14:14
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 统计所有小于非负整数 n 的质数的数量。
 * 
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 */
public class CountPrimes {
	
	public static void main(String[] args) {
		System.out.println(countPrimes(5));
	}

	
    public  static int countPrimes(int n) {
    	
    	if(n <= 2){
    		return 0;
    	}
    	
    		int res = 0;
    	   boolean[] nums = new boolean[n];
           for (int i = 2; i < nums.length; i++) {  //首先标记全部标记为true
               nums[i] = true;
           }

           //遍历数组，采用上述算法，标记是倍数的为false
           for(int i = 2; i*i < nums.length; i++) {
               if (nums[i]) {
                   for(int j = i*i; j < nums.length; j+=i) {
                       nums[j] = false;
                   }
               }
           }

         //统计出为true的，就是质数的总数
           for(boolean bool : nums) {
              res += bool ? 1 : 0;
           }
           
           return res; 

//    	if(n <= 2){
//    		return 0 ;
//    	}
//        int[] nums = new int[n];
//        for (int i =2; i < nums.length; i++) {
//			nums[i] = i;
//		}
//        System.out.println(Arrays.toString(nums));
//        int count = 2;
//        for (int i = 2; i*i < n; i++) {
//			for (int j = i*i; j < n; j+=i) {
//				if(nums[j] != 0){
//					nums[j] = 0;
//					count ++;
//				}
//			}
//		}
//        System.out.println(Arrays.toString(nums));
//        System.out.println(count);
//        return n-count;
    }
}
