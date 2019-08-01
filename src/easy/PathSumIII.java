package easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author GK
 * @version 创建时间：2019-8-1 下午3:50:35
 * @ClassName 类名称
 * @Description 类描述
 */
public class PathSumIII extends LeetcodeEasyLevel {

	public static void main(String[] args) {
			String str = "[10,5,-3,3,2,null,11,3,-2,null,1]";
			TreeNode tree = stringToTreeNode(str);
//			System.out.println(tree.toString());
			System.out.println(pathSum(tree, 8));
	}
	
	public static int pathSum(TreeNode root,int sum){
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		return helper(root,map,sum,0);
	}

    // public static int helper(TreeNode root,int sum){
    //     if(root == null){return 0;}
    //     sum -= root.val;
    //     return(sum == 0 ? 1:0)+helper(root.left,sum)+helper(root.right,sum);
    // }

	private static int helper(TreeNode root, HashMap<Integer, Integer> map, int sum, int pathSum) {
		int res = 0;
		if(root == null){ return 0;}
		pathSum += root.val;
		if(map.containsKey(pathSum-sum)){
			res += map.get(pathSum-sum);
		}else{
			res += 0;
		}
		if(map.containsKey(pathSum)){
			map.put(pathSum, map.get(pathSum)+1);
		}else{
			map.put(pathSum, 1);
		}
		res = helper(root.left,map,sum,pathSum)+helper(root.right, map, sum, pathSum)+res;
		map.put(pathSum, map.get(pathSum)-1);
		return res;
	}
	
	public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
	}
}
