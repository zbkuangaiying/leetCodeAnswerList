package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author GK
 * @version 创建时间：2019-4-25 上午9:15:29
 * @ClassName 类名称
 * @Description 类描述
 * 
 *              给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 */
public class BinaryTreeLevelOrderTraversalII extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.right.left = new TreeNode(15);
		p.right.right = new TreeNode(7);
		
		levelOrderBottom(p);

	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		List<List<Integer>> all = new ArrayList<List<Integer>>();
		levelOrderBottom(all,0,root);
		Stack<List<Integer>> stack = new Stack<>();
		for (int i = 0; i < all.size(); i++) {
			stack.push(all.get(i));
		}
		all.clear();
		while (!stack.isEmpty()) {
			all.add(stack.pop());
		}
		System.out.println(all);
		return all;
//		List<Integer> cuurentList = new ArrayList<>();
//		if (root == null) {
//			return all;
//		}
//		if(root.left == null && root.right == null){
//			cuurentList.add(root.val);
//			all.add(cuurentList);
//			return all;
//		}
//		Queue<TreeNode> queue = new LinkedList<>();
//	
//		
//		queue.add(root);
//		int currentLevel = 0; 
//		int i = 0;
//		
//		while (!queue.isEmpty()) {
//			TreeNode n = queue.poll();
//			if(n != null){
//				cuurentList.add(n.val);
//				System.out.print(n.val+" ");
//				queue.add(n.left);
//				queue.add(n.right);
//			}else{
//				System.out.print(0+" ");
//			}
//			System.out.println(cuurentList.toString());
//			i++;
//			if(i == Math.pow(2, currentLevel)){
//				currentLevel++;
//				i = 0;
//				if(cuurentList.size() != 0){
//					stack.push(cuurentList);
//				}
//				cuurentList = new ArrayList<>();
//			}
//		}
//
//		System.out.println(stack.toString());
//		while (!stack.isEmpty()) {
//			all.add(stack.pop());
//		}
//		System.out.println(all.toString());
//		return all;
	}


	private static void levelOrderBottom(List<List<Integer>> all, int level, TreeNode root) {
		if(root == null){
			return;
		}
		System.out.println(root.toString());
		System.out.println(all.toString());
		if(all.size() <= level){
			List<Integer> list = new ArrayList<>();
            list.add(root.val);
            all.add(list);
		}else{
			 all.get(level).add(root.val);
		}
		System.out.println(all.toString());
		levelOrderBottom(all, level + 1, root.left);
		levelOrderBottom(all, level + 1, root.right);
	}
}
