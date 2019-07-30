package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author GK
 * @version 创建时间：2019-7-30 下午2:00:45
 * @ClassName 类名称
 * @Description 类描述
 */
public class NaryTreeLevelOrderTraversal extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		List<Node> list = new ArrayList<>();
		list.add(new Node(2,null));
		list.add(new Node(3,null));
		list.add(new Node(4,null));
		Node n = new Node(1,list);
		System.out.println(levelOrder(n));
	}
	
    public  static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<Node>  quque = new LinkedList<>();
        quque.add(root);
        while (!quque.isEmpty()) {
			List<Integer> list = new LinkedList<>();
			int count = quque.size();
			while (count -- > 0) {
				Node current = quque.poll();
				list.add(current.val);
				if(current.children != null){
					for (Node n : current.children) {
						if(n != null){
							quque.add(n);
						}
					}
				}
			}
			result.add(list);
		}
		return result;
    	
    }

	static  class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}
}
