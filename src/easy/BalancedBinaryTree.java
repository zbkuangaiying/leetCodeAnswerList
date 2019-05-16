package easy;

import easy.LeetcodeEasyLevel.TreeNode;

/**
 * @author GK
 * @version 创建时间：2019-4-28 下午2:47:27
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 
 */
public class BalancedBinaryTree extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
		TreeNode p = new TreeNode(3);
		p.left =new TreeNode(9);
		p.right = new TreeNode(20);
		p.right.left = new TreeNode(15);
		p.right.right = new TreeNode(7);
		
		
		boolean b = isBalanced(p);
		System.out.println("树+"+p+"是否是平衡树------>"+b);
		
	}
	
	  public static boolean isBalanced(TreeNode root) {
	        //拿到树的左子节点深度  
		  //拿到树的右子节点深度
		  //对比一下
		  if(root == null){
			  return true;
		  }
		  int leftHigh = maxDepth(root.left);
		  int rightHigh = maxDepth(root.right);
		  
		  int result = Math.abs(leftHigh-rightHigh);
		  return result <= 1 && isBalanced(root.left) && isBalanced(root.right) ;
		  
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
	        if(root == null){
	        	return 0;
	        }	   
	        int leftLength = maxDepth(root.left);
	        int rightLength = maxDepth(root.right);
	        return Math.max(leftLength, rightLength)+1;
		   
		   
	    }
}


//int lshight(struct TreeNode* root){
//    if(root == NULL) return 0;
//    int left = lshight(root->left);
//    int right = lshight(root->right);
//    if(left >= right) return left+1;
//    else return right+1;
//}
//
//bool isBalanced(struct TreeNode* root) {
//    if(root == NULL) return true;
//    if(lshight(root->left)-lshight(root->right) >= -1 && lshight(root->left)-lshight(root->right) <= 1 && isBalanced(root->left) && isBalanced(root->right))
//        return true;
//    else return false;
//}