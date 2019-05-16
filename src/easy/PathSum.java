package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-5-1 下午1:10:48
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class PathSum extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(5);
		p.left = new TreeNode(4);
		p.right = new TreeNode(8);
		p.left.left = new TreeNode(11);
		p.left.left.left = new TreeNode(7);
		p.left.left.right = new TreeNode(2);
		
		p.right.left = new TreeNode(13);
		p.right.right =  new TreeNode(4);
		p.right.right.right = new TreeNode(1);
		
		boolean b = hasPathSum(p, 22);
		System.out.println(b);
//		System.out.println(generate(8).toString());
		
		
	}
    public static boolean hasPathSum(TreeNode root, int sum) {
        
    	if(root == null){
    		return false;
    	}
    	sum -= root.val;
    	if(root.left == null && root.right == null){
    		return sum == 0;
    	}else{
    		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    	}
    }
   
	
}
