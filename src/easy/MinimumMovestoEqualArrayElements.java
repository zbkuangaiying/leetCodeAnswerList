package easy;
/**
 * @author GK
 * @version 创建时间：2019-8-9 下午4:26:36
 * @ClassName 类名称
 * @Description 类描述
 */
public class MinimumMovestoEqualArrayElements extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	
	  public static int minMoves(int[] nums){
		  int min = Integer.MAX_VALUE;
		  int moves = 0;
		  for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		  for (int i = 0; i < nums.length; i++) {
			moves = nums[i]-min;
		}
		  return moves;
	  }
}
