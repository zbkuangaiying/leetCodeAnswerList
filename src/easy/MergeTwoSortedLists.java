package easy;

/**
 * @author GK
 * @version 创建时间：2019-4-3 上午9:01:16
 * @ClassName 类名称
 * @Description 类描述 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 
 *              输入：1->2->4, 1->3->4
 * 
 *              输出：1->1->2->3->4->4
 *              
 *	
 *
 */
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		n1.next = new ListNode(2);
		n1.next.next = new ListNode(4);

		ListNode n2 = new ListNode(1);
		n2.next = new ListNode(3);
		n2.next.next = new ListNode(4);

		ListNode n3 = mergeTwoLists(n1, n2);

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 if(l1 == null){
	            return l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
		ListNode head = new ListNode(0);
			ListNode current = head;
		while (l1 != null && l2 != null) {

				int x = l1.val;
				int y = l2.val;

				if (x > y) {
					current.next = l2;
					l2 = l2.next;
				} else {
					current.next = l1;
					l1 = l1.next;
				}
	            current = current.next;
				if (l1 == null) {
					current.next = l2;
				}
				if (l2 == null) {
					current.next = l1;
				}	
	           
			}
			return head.next;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
