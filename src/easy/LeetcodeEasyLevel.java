package easy;

import easy.MergeTwoSortedLists.ListNode;

/**
 * @author GK
 * @version 创建时间：2019-4-8 上午9:14:10
 * @ClassName 类名称
 * @Description 类描述
 */
public class LeetcodeEasyLevel {

	public static boolean isEmpty(CharSequence str) {
		if (str == null || str.length() == 0)
			return true;
		else
			return false;
	}

	/**
	 * Definition for a binary tree node.
	 */
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
		}

	}

	public static class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
		
		public void deleteNode(int i) {
			ListNode temp = this;
			int n = 0;
			if (temp.val == i && temp.next != null) {
				temp.val = temp.next.val;
				temp.next = temp.next.next;
				return;
			}
			while (true) {
				n++;
				temp = temp.next;
				if (temp.val == i) {
					if (temp.next == null) {
						deleteLastOne(n-1);
						return ;
					} else {
						temp.val = temp.next.val;
						temp.next = temp.next.next;
						return;
					}
				}
			}

		}

		private void deleteLastOne(int n) {
			ListNode temp = this;
			for (int i = 0; i < n; i++) {
				temp = temp.next;
			}
			temp.next = null;
		}

		public ListNode addNode(int i) {
			ListNode a = new ListNode(i);
			ListNode temp = this;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = a;
			return this;
		}
		public ListNode getLastOne(){
			ListNode temp = this;
			while (temp.next != null) {
				temp = temp.next;
			}	
			return temp;
		}

	
		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}
	
	public static boolean isEquals(ListNode nodeA,ListNode nodeB){
		if(nodeA == null || nodeB == null){
			return false;
		}
		return nodeA.val == nodeB.val;
	}
}
