package easy;

import java.util.Arrays;

import javax.swing.plaf.TextUI;

/**
 * @author GK
 * @version 创建时间：2019-5-22 上午9:28:14
 * @ClassName 类名称
 * @Description 类描述 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 * 
 *              输入: [1,2,3,4,5,6,7] 和 k = 3 输出: [5,6,7,1,2,3,4] 解释: 向右旋转 1 步:
 *              [7,1,2,3,4,5,6] 向右旋转 2 步: [6,7,1,2,3,4,5] 向右旋转 3 步:
 *              [5,6,7,1,2,3,4]
 * 
 *              尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。 要求使用空间复杂度为 O(1) 的原地算法。
 */
public class RotateArray extends LeetcodeEasyLevel {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}
	
	
	//方法3  3次反转... 1ms  这个方法真的妙啊.....
	public static void rotate(int[] nums, int k) {
		if(k > nums.length - 1){
			k %= nums.length;
		}
		if(k > 0){
			reverse(nums,0,nums.length-k-1);
			reverse(nums,nums.length-k,nums.length-1);
			reverse(nums,0,nums.length-1);
		}
	}


	private static void reverse(int[] nums, int i, int j) {

		while (i < j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		i++;
		j--;
		}
		
	}

//	//方法2 老老实实一个一个放 简直蠢到爆炸  145ms
//	public static void rotate(int[] nums, int k) {
//		if(k > nums.length - 1){
//			k %= nums.length;
//		}
//		if(k != 0){
//			while (k > 0 ) {
//				int temp = nums[nums.length-1];
//				for (int i = nums.length-2; i  >= 0; i--) {
//					nums[i+1] = nums[i];
//				}
//				nums[0] = temp;
//				k--;
//			}
//		
//		}
//		
//	}
	// 方法1 取模放入 一次循环  2ms
//	public static void rotate(int[] nums, int k) { 
//		if (k > nums.length - 1) {
//			k %= nums.length;
//		}
//		int[] temp = new int[nums.length];
//		if (k > 0) {
//			k++;
//			for (int i = 0; i < temp.length; i++) {
//				temp[k % temp.length] = nums[i];
//				k++;
//			}
//			for (int i = 0; i < temp.length; i++) {
//				nums[i] = temp[i];
//			}
//		}
//	}
}
