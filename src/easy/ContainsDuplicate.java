package easy;

import java.util.Arrays;


/**
 * @author GK
 * @version 创建时间：2019-6-4 上午9:29:31
 * @ClassName 类名称
 * @Description 类描述
 * 给定一个整数数组，判断是否存在重复元素。

如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false
 */
public class ContainsDuplicate extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,1};
		
		
	}
	  public static boolean containsDuplicate(int[] nums) {
		  //放入set 比较set与原数组的长度... 最坏的情况是n
		  
		  // if(nums.length == 0){
	        //     return false;
	        // }
	        // if(nums.length == 1){
	        //     return false;
	        // }
	        // Set<Integer> set = new HashSet<>();
	        // for(int i = 0 ; i < nums.length ; i ++){
	        //     set.add(nums[i]);
	        //     if(set.size() != (i+1)){
	        //         return true;
	        //     }
	        // }
	        // return false;
		  
		  //排序比较i与i+1;
		  Arrays.sort(nums);
		  for (int i = 0; i < nums.length -1 ; i++) {
			if(nums[i] == nums[i+1]){return true;}
		}
		  return false;
	  }
}
