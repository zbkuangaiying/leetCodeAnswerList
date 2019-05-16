package easy;

/**
 * @author GK
 * @version 创建时间：2019-5-9 上午9:52:35
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 
 * 输入: [2,2,1] 输出: 1
 * 输入: [4,1,2,1,2]输出: 4
 */
public class SingleNumber extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		int[] arr = new int[]{4,1,2,1,2};
		System.out.println("数组中只出现一次的数字是---->"+singleNumber(arr));
	}

	  public static int singleNumber(int[] nums) {
		  if(nums == null ){  return 0;}
		  if(nums.length == 0 ){return 0;}
		  int result = 0;
		  for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		  return result;
	  }
}
