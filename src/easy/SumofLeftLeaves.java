package easy;

/**
 * @author GK
 * @version 创建时间：2019-7-19 上午10:33:15
 * @ClassName 类名称
 * @Description 类描述
 */
public class SumofLeftLeaves extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
	
		TreeNode p = new TreeNode(3);
		p.left = new TreeNode(9);
		p.right = new TreeNode(20);
		p.right.left = new TreeNode(15);
		p.right.right = new TreeNode(22);
		System.out.println(sumOfLeftLeaves(p));
		
		
	}
	
	  static int sum = 0;
	    public static int sumOfLeftLeaves(TreeNode root) {
	    	//简单递归
	    	//由下往上加 
	    	//深度优先的
	    	//公式就是  保证自己不为空并且保证自己没有子结点 即可累加自己的左子节点
	    	if(root == null ){return sum;}
	    	if(root.left != null && root.left.left == null && root.left.right == null){
	    		sum += root.left.val;
	    	}
	    	sumOfLeftLeaves(root.left);
	    	sumOfLeftLeaves(root.right);
	    	return sum;
//	        if(root == null){return sum;};
//	        if(root.left != null && root.left.left == null && root.left.right== null){
//	             sum += root.left.val;
//	        }
//	        sumOfLeftLeaves(root.left);
//	        sumOfLeftLeaves(root.right);
//	        return sum;
	        
	        
	    }

}
