package easy;

import java.text.BreakIterator;
import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-4-12 上午9:06:20
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 输入: [1,2,3]	输出: [1,2,4]	解释: 输入数组表示数字 123。
 * 输入: [4,3,2,1]	输出: [4,3,2,2]	解释: 输入数组表示数字 4321。
 */
public class PlusOne extends LeetcodeEasyLevel{
	
	public static void main(String[] args) {
		int[] nums = new int[]{9,9,9,9,9,9,8,9,9,9};
		int[] result = plusOne(nums);
		System.out.println(Arrays.toString(result));
	}

    public static int[] plusOne(int[] nums) {
    	if(nums == null){
    		return new int[]{0};
    	}
    	int arr[] = null;
    	for (int i = nums.length -1; i >= 0 ; i--) {
			if(nums[i] == 9){
				nums[i] = 0;
			}else{
				nums[i] = nums[i]+1;
				break;
			}
		}
//    	if(nums[0] == 0){
//    		arr = new int[nums.length+1];
//    		arr[0] = 1;
//    		for (int i = 1; i < arr.length; i++) {
//				arr[i] = nums[i];
//			}
//    	}else{
//    		arr = nums;
//    	}
    	arr = nums;
    	if(arr[0] == 0){
    		arr = new int[nums.length+1];
    		arr[0] = 1;	
    	}
    	return arr;
    }
}
