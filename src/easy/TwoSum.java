package easy;

import java.util.HashMap;
import java.util.Map;


/**
 * @author GK
 * @version 创建时间：2019-3-26 上午9:08:47
 * @ClassName 类名称
 * @Description 
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

	public static void main(String[] args) {
		String amt = null;
		System.out.println("TextUtils.isEmpty(amt)---->"+isEmpty(amt));
		amt = isEmpty(amt) ? "0.0":amt;
		System.out.println(String.format("%.2f", Double.parseDouble("0.0")));
//		int[] nums = new int[]{-2,7,11,15};
//		int target = 9;
//		int[] result = twosum(nums,target);
//		if(result != null){
//			System.out.println(Arrays.toString(result));
//		}
	}

	private static int[] twosum(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		//仍然是遍历整个数组 从第0个下标开始  
		//先取得target减去第一个的值
		//如果这个值 存在于map中 说明这个值之前存储过  如果这个值不存在于map中 则把这个值以及其对应的下标存到map里
		//比如 9-(-2) =11  map里没有-2 那就把-2存起来
		//回头9-11 = -2 我们发现-2 已经存起来过了
		//那么 11 与 -2 就为我们的解  加法的交换律? 等效替代?
		for (int i = 0; i < nums.length; i++) {
			int result = target - nums[i];
			if(map.containsKey(result)){
				return new int[]{map.get(result),i};
			}
			map.put(nums[i],i);
		}
		return null;
	}
	
	 public static boolean isEmpty(CharSequence str) {
	        if (str == null || str.length() == 0)
	            return true;
	        else
	            return false;
	    }

}
