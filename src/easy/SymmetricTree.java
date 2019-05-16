package easy;

/**
 * @author GK
 * @version 创建时间：2019-4-23 上午9:13:58
 * @ClassName 类名称
 * @Description 类描述
 * 
 *	给定一个二叉树，检查它是否是镜像对称的。 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *              
 *	如果一个树的左子树与右子树镜像对称，那么这个树是对称的。
 *	因此，该问题可以转化为：两个树在什么情况下互为镜像？
 *
 *	如果同时满足下面的条件，两个树互为镜像：
 *		1.它们的两个根结点具有相同的值。
 *		2.每个树的右子树都与另一个树的左子树镜像对称。
 *	
 *就像人站在镜子前审视自己那样。镜中的反射与现实中的人具有相同的头部，但反射的右臂对应于人的左臂，反之亦然。
 *
 */
public class SymmetricTree extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(2);
		p.left.left = new TreeNode(3);
		p.left.right = new TreeNode(4);
		p.right.left = new TreeNode(4);
		p.right.right = new TreeNode(3);

		boolean b = isSymmetric(p);
		System.out.println(b);
	}

	public static boolean isSymmetric(TreeNode root) {
		TreeNode p = root;
		TreeNode q = root;
		return isMirror(p, q);
	}

	private static boolean isMirror(TreeNode p, TreeNode q) {
		if (q == null && q == null) {
			return true;
		}
		if (p == null || q == null) {
			return false;
		}
		return p.val == q.val && isMirror(p.left, q.right) && isMirror(p.right, q.left);
	}

}
