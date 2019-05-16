package easy;

/**
 * @author GK
 * @version 创建时间：2019-4-18 上午9:13:16
 * @ClassName 类名称
 * @Description 类描述 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 输入: 1->1->2 输出: 1->2 输入:
 *              1->1->2->3->3 输出: 1->2->3
 * 
 *              收获:链表添加元素 拿到需要添加链表 取得其地址 将其赋值给新链表 走到新链表末尾 为新链表添加一个元素
 * 
 */
public class RemoveDuplicatesFromSortedList extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		ListNode ln = new ListNode(1);
		// 创建一个listNode 是ln的next
		//
		ln.addNode(2);
		ln.addNode(2);
		ln.addNode(3);
		ln.addNode(3);
		ln.addNode(4);

		ln.deleteNode(4);
		System.out.println(ln.toString());

		// ListNode result = deleteDuplicates(ln);
		// System.out.println(result.toString());
		// ListNode [val=1, next=ListNode [val=2, next=ListNode [val=2,
		// next=ListNode [val=3, next=ListNode [val=3, next=ListNode [val=4,
		// next=null]]]]]]
		// ListNode [val=1, next=ListNode [val=2, next=ListNode [val=3,
		// next=ListNode [val=3, next=ListNode [val=4, next=null]]]]]
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		System.out.println(head.toString());
		ListNode temp = head;
		System.out.println(temp.toString());
		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val) {
				System.out.println(temp.toString());
				temp.next = temp.next.next;
				System.out.println(temp.toString());
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	/**
	 * Definition for singly-linked list.
	 */
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		public void deleteNode(int i) {
			ListNode temp = this;
			ListNode slow = this;
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

		@Override
		public String toString() {
			return "ListNode [val=" + val + ", next=" + next + "]";
		}

	}

}
