package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-5-15 上午9:20:33
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class TwoSumIIByInputarrayissorted extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,4,9,56,90};
		int[] result = twoSum(arr, 8);
		System.out.println(Arrays.toString(result));
		
	}
	
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers == null){
        	return null;
        }
        if(numbers.length == 1){
        	return null;
        }
        if(numbers[0] > target){
        	return null;
        }
        
  
        int[] result = new int[2];
//        outer: for (int k = 0; k < numbers.length; k++) {
//        	result[0] = k+1;
//            int minus = target - numbers[k];
//            inner:for (int i = k+1; i < numbers.length; i++) {
//    			if(numbers[i] == minus){
//    				result[1] = i+1;
//    				break outer;
//    			}
//    		}
//		}
//        if(result[1] == 0){
//        	return  null;
//        }
        int i = 0;
        int j = numbers.length -1;
        while (i < j) {
			int p = numbers[i];
			int q = numbers[j];
			if(p > target){
				return null;
			}
			if(p+q > target){
				j--;
			}
			if(p+q < target){
				i++;
			}
			if(p+q == target){
				break;
			}
		}
        result[0] = i+1;
        result[1] = j+1;
        
        return result;
    }
}
