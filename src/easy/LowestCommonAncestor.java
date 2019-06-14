package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-14 上午9:59:26
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 * 
 * 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * 输出: 6 
 * 解释: 节点 2 和节点 8 的最近公共祖先是 6。
 */
public class LowestCommonAncestor extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
	}
	
	static TreeNode res = null;
	    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        lca(root,p,q);
	            return res;
	    }
	    public static void lca(TreeNode root, TreeNode p, TreeNode q){
	    	//如果两个结点一个比父结点小 一个比父节点大  
	    	//那么说明这两个结点一定在是父结点的两侧 
	    	//那么父节点就一定是当前的俩节点的最近公共祖先。
	        if((root.val-p.val)*(root.val-q.val) <= 0 ) {
	            res = root;
	        }else if(root.val < p.val && root.val < q.val){ // 如果俩个结点都在父节点的右侧  那么 继续往下递归查找
	             lca(root.right,p,q);
	        }else{//反之亦然.
	             lca(root.left,p,q);
	        }
	    }

}
