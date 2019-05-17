package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-5-17 上午9:41:39
 * @ClassName 类名称
 * @Description 类描述 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *              你可以假设数组是非空的，并且给定的数组总是存在众数。
 */
public class MajorityElement extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		// 众数 个数大于 n/2
		// 数组排序之后那中间值一定是众数
		// 排序取中值实在爆炸

		// 新方法 摩尔投票

		int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2 };
		System.out.println(majorityElement(arr));
	}

	public static int majorityElement(int[] nums) {
//		Arrays.sort(nums);
//		return nums[nums.length/2];
		int currentNum = nums[0];
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			if(count == 0){
				currentNum = nums[i];
			}
			if(currentNum == nums[i]){
				count++;
			}else{
				count--;
			}
		}
		return currentNum;

	}

}
