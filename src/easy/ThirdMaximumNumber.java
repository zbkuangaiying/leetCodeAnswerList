package easy;

import java.util.PriorityQueue;

/**
 * @author GK
 * @version 创建时间：2019-7-26 下午5:12:51
 * @ClassName 类名称
 * @Description 类描述
 */
public class ThirdMaximumNumber extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println(thirdMax(nums));
	}
	
	public static int thirdMax(int[] nums) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if((queue.size() < 3 || nums[i] > queue.peek())&& !queue.contains(nums[i])){
				queue.offer(nums[i]);
			}
			if(queue.size() > 3){
				queue.poll();
			}
			max = Math.max(max,nums[i]);
		}
		return queue.size() < 3 ? max:queue.peek();
		
		

	
	}
}
