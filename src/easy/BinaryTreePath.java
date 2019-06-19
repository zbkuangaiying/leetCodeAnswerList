package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-6-19 下午2:36:39
 * @ClassName 类名称
 * @Description 类描述
 */
public class BinaryTreePath extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	  public static List<String> binaryTreePaths(TreeNode root) {
	        List<String> list = new ArrayList<>();
	        if(root == null){
	        	return list;
	        }
	       String temp = "";
	       addPath(list,root,temp);
	    }

	private static void addPath(List<String> list, TreeNode root, String temp) {
		if(root == null){
			return;
		}
		temp += root.val;
		if(root.left == null && root.right == null){
			list.add(temp);
			return;
		}else{
			addPath(list, root.left, temp);
			addPath(list, root.right, temp);
		}
		
	}
}
