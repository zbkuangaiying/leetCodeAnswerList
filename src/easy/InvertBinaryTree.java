package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-10 上午9:12:34
 * @ClassName 类名称
 * @Description 类描述
 */
public class InvertBinaryTree extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	
    public static TreeNode invertTree(TreeNode root) {
        if(root == null || (root.left ==null && root.right == null)){
        	return root;
        }
        	TreeNode p = root.left;
        	TreeNode q = root.right;
        	root.left = invertTree(q);
        	root.right = invertTree(p);
        	return root;
    }
}
