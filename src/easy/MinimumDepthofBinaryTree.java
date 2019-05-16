package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-29 上午11:47:23
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class MinimumDepthofBinaryTree extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.right.left = new TreeNode(15);
		p.right.right = new TreeNode(7);
		
		int minDepth = minDepth(p);
		
		System.out.println("树"+p+"的最小深度是-->"+minDepth);
	}
	
	
    public static int minDepth(TreeNode root) {
        
    	if(root == null){
    		return 0;
    	}
    	if(root.right == null){
    		return minDepth(root.left)+1;
    	}
    	if(root.left == null){
    		return minDepth(root.right)+1;
    	}
    	int minDepthLeft = minDepth(root.left);
    	int minDepthRight = minDepth(root.right);
    	return Math.min(minDepthLeft, minDepthRight)+1;
    }

}
