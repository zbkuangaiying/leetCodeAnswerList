package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-5-27 上午9:19:00
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 */
public class HouseRobber extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] nums = new int[]{2,1,1,2};
		
		System.out.println(rob(nums));
	}
	
    public static int rob(int[] nums) {
        if(nums.length == 0){
        	return 0;
        }
        if(nums.length == 1){
        	return nums[0];
        }
        if(nums.length == 2){
        	return Math.max(nums[0], nums[1]);
        }
        int result[] = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
        	System.out.println(Arrays.toString(result));
        	System.out.println(Arrays.toString(nums));
        	System.out.println("当前的 index 是 "+ i );
        	System.out.println("当前的 result[i-1] = "+ result[i-1] );
        	System.out.println("当前的 nums[i]+result[i-2] =  "+ (nums[i]+result[i-2]) );
        	result[i] = Math.max(result[i-1], nums[i]+result[i-2]);
		}
        return result[nums.length-1];
    }
}
