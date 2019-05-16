package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-22 上午9:43:20
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定两个二叉树，编写一个函数来检验它们是否相同。如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 输入:       1         1					输入:      1          1
 *         		/ \       / \						        /           \
 *        		2   3     2   3						   2             2
*
*        	[1,2,3],   [1,2,3]						[1,2],     [1,null,2]
*
*			输出: true								输出: false
*
 */

public class SameTree extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		 boolean b = isSameTree(p,q);
		 System.out.println(b);
	}

	
	
	private static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q != null){
			return false;
		}
		if(p != null && q == null){
			return false;
		}
		if(p == null && q == null){
			return true;
		}
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

}
