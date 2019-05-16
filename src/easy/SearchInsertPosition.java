package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-9 上午9:32:01
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置
 * 你可以假设数组中无重复元素。
 * 
 * 输入: [1,3,5,6], 5 输出: 2
 * 输入: [1,3,5,6], 2 输出: 1
 * 输入: [1,3,5,6], 7 输出: 4
 * 输入: [1,3,5,6], 0 输出: 0
 */
public class SearchInsertPosition extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int target = 5;
		int index = searchInsert(arr, target);
		System.out.println(index);
	}
	
	
	/**
	 * 用二分查找法
	 * @param nums
	 * @param target
	 * @return
	 */
	 public static  int searchInsert(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length -1;
	        int loc = 0;
	        while (low <= high) {
				int mid = low+(high-low)/2;
				if(nums[mid] == target){
					return mid;
				}else if(nums[mid] > target){
					loc = mid;
					high = mid-1;
				}else{
					low = mid+1;
					loc = mid+1;
				}
			}
		 return loc;
	    }
}
