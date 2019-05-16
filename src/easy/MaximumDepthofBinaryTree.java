package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author GK
 * @version 创建时间：2019-4-24 上午9:20:55
 * @ClassName 类名称
 * @Description 类描述
 * 给定一个二叉树，找出其最大深度。二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MaximumDepthofBinaryTree extends LeetcodeEasyLevel {
	static int i = 0;
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.right = new TreeNode(3);
		p.right.left = new TreeNode(3);
		p.right.right = new TreeNode(3);
		
//		int number = 0;
//		for (int i = 15; i >0; i /=2) {
//			number++;
//		}
//		System.out.println(number);
		
		int depth = maxDepth(p);
		System.out.println("这个树的深度是---->"+depth);

	}

	
	
	   public static int maxDepth(TreeNode root) {
		   
		   //下面这个想法无法解决单独一个子节点无限延伸的情况
//		   List<TreeNode> list = new ArrayList<>();
//		   TreeNode tempLeft = root.left;
//		   TreeNode tempRight = root.right;
//		   list.add(root);
//		   list.add(tempLeft);
//		   list.add(tempRight);
//			
//		   return 0;
		   
		   //递归可以做到. 遍历所有节点...碉堡了..
		   System.out.println("查询次数"+ ++i);
	        if(root == null){
	        	  System.out.println("当前的树是---->"+null);
	        	return 0;
	        }	   
	        System.out.println("当前的树是---->"+root.toString());
	        int leftLength = maxDepth(root.left);
	 	   System.out.println("当前的leftLength是---->"+leftLength);
	        int rightLength = maxDepth(root.right);
	        System.out.println("当前的rightLength是---->"+rightLength);
	        return Math.max(leftLength, rightLength)+1;
		   
		   
	    }
}
