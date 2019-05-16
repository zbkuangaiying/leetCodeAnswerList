package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-4-10 上午9:31:05
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class MaximumSubarray extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int maxSum = maxSubArray(arr);
		System.out.println(maxSum);
	}
	
	 public static int maxSubArray(int[] nums) {
		 int ans = nums[0];
		 for (int i = 1; i < nums.length; i++) {
				System.out.println("循环次数----->"+i+",当前的nums["+i+"]---->"+nums[i]+",当前的nums["+(i-1)+"]---->"+nums[i-1]);
			nums[i] += Math.max(nums[i-1], 0);
			System.out.println("与之前的相加结果是---->"+nums[i]);
			ans = Math.max(nums[i], ans);
			System.out.println("赋值给之前一次的最大值---->"+ans);
		}
		 System.out.println(Arrays.toString(nums));
		 return ans;
	 }
}
