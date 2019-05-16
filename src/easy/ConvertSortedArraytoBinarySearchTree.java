package easy;

import java.util.Arrays;


/**
 * @author GK
 * @version 创建时间：2019-4-26 上午9:24:44
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * 
 * 
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *      0
 *    / \
 *  -3   9
 *  /   /
 *	10  5
 */
public class ConvertSortedArraytoBinarySearchTree extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		int[] arr = new int[]{-10,-3,0,5,9};
		TreeNode p = sortedArrayToBST(arr);
		System.out.println(p.toString());
		
	}
	 public static TreeNode sortedArrayToBST(int[] nums) {
		 if(nums.length == 0){
			 return null;
		 }
		 TreeNode root = new TreeNode(nums[nums.length/2]);
		 root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
		 root.right =sortedArrayToBST(Arrays.copyOfRange(nums, nums.length/2+1, nums.length));
		 return root;
		 
	    }
		 
//	        if(nums.length == 0)
//	        return null;
//	        
//	        TreeNode root = new TreeNode(nums[nums.length/2]);
//	        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,nums.length/2));
//	        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,nums.length/2+1,nums.length));
//	        return root;

	 
	 
		
}
