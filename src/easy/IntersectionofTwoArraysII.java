package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-7-8 下午3:04:33
 * @ClassName 类名称
 * @Description 类描述
 */
public class IntersectionofTwoArraysII extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{4,9,5};
		int[] nums2 =  new int[]{9,4,9,8,4};
		
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}
	
    public static int[] intersect(int[] nums1, int[] nums2) {
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int i =0,j=0;
    	List<Integer> list = new ArrayList<>();
    	while (i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]){
				list.add(nums1[i]);
				i++;
				j++;
			}else if(nums1[i] > nums2[j]){
				j++;
			}else{
				i++;
			}
		}
    	i=0;
    	int[] result = new int[list.size()];
    	for( ;i < list.size(); i++) {
			result[i] = list.get(i);
		}
    	return result;
    }

}
