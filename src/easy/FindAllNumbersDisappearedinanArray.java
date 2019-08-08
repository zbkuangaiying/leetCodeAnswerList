package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-8-8 下午2:36:00
 * @ClassName 类名称
 * @Description 类描述
 */
public class FindAllNumbersDisappearedinanArray extends LeetcodeEasyLevel{
	
	public static void main(String[] args) {
		int[] nums = new int[]{4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	  public static List<Integer> findDisappearedNumbers(int[] nums) {
		  //桶排序 
		 List<Integer> list = new ArrayList<>();
		 for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i+1 && nums[nums[i] -1] != nums[i]) {
//				System.out.print(nums[i]+",");
//				 System.out.print(i+1+",");
//				 System.out.print(nums[nums[i] -1]+".");
				swap(nums,i,nums[i]-1);
//				System.out.println();
			}
		}
		 //排序之后不在指定未知的值 就是缺失的值
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i] != i+1){
				list.add(i+1);
			}
		}
		 return list;
		  
	  }
	  
	  private static void swap(int nums[],int i, int j){
		  nums[i] = nums[i]^nums[j];
		  nums[j] = nums[i]^nums[j];
		  nums[i] = nums[i]^nums[j];
	  }

}
