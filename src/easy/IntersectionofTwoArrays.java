package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

/**
 * @author GK
 * @version 创建时间：2019-7-5 下午2:27:08
 * @ClassName 类名称
 * @Description 类描述
 */
public class IntersectionofTwoArrays extends LeetcodeEasyLevel {

	
	public static void main(String[] args) {
		
		int[] arr1 = new int[]{4,9,5};
		int[] arr2 = new int[]{9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(arr1,arr2)));
		
	}
	
	 public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> setA = new HashSet();
	        Set<Integer> setB = new HashSet();
	        for (int i = 0; i < nums1.length; i++) {
				setA.add(nums1[i]);
			}
	        for (int i = 0; i < nums2.length; i++) {
				setB.add(nums2[i]);
			}

	        List<Integer> list = new ArrayList<>();
	        for (Integer integer : setA) {
				if(setB.contains(integer)){
					list.add(integer);
				}
			}
	        int[] result = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
				result[i] = list.get(i);
			}
	        return result;
	 }
}
