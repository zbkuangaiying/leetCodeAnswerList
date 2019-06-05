package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GK
 * @version 创建时间：2019-6-5 上午9:16:48
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * 
 * 暴力比较最差3N  map法最差N 
 * 
 * 暴力法有个1ms的    双循环利用i!=j && (i-j)*(i-j) < k*k 这个判断来替代掉正常暴力法绝对值判断.
 * 暴力法不被推崇他妈的是有原因的   这也太优秀了...
 *
 */
public class ContainsDuplicateII extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
		System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
	}

	
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
	        if(nums.length < 2){
	        	return false;
	        }
	        Map<Integer,Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
				if(map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k){
				
					return true;
				}else{
					map.put(nums[i], i);
				}
			}
			return false;
	  }
}
