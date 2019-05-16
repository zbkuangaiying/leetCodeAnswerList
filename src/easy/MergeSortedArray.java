package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-4-19 上午9:10:44
 * @ClassName 类名称
 * @Description 类描述
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 输入:nums1 = [1,2,3,0,0,0],m = 3	nums2 = [2,5,6],n = 3	输出: [1,2,2,3,5,6]
 * 
 * 
 * 解题核心思路:拿到nums1的副本..这样对nums1改造的时候就不会影响我们从副本中取值
 * 
 */
public class MergeSortedArray extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		int[] numsA =  {1,2,3,0,0,0};
		int[] numsB =  {2,5,6};
		int[] result = merge(numsA,3,numsB,3);
		System.out.println(Arrays.toString(result));
	}

	 public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	        if(m== 0){
	        	return nums2;
	        }
	        if(n == 0){
	        	return nums1;
	        }
	        int[] temp = (int[]) nums1.clone();
	        int p = 0;// nums1 的下标
	        int q = 0;//nums2的下标
	        for (int i = 0; i < m+n; i++) {
	        	int n1 = Integer.MAX_VALUE,n2 = Integer.MAX_VALUE;
				if(p < m){
					n1 = temp[p];
				}
				if(q < n){
					n2 = nums2[q];
				}
				
				if(n1 <= n2){
					nums1[i] = n1;
					p++;
				}else{
					nums1[i] = n2;
					q++;
				}
			}
	     
		return nums1;
	     
	  }
}
