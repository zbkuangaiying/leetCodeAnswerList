package easy;

/**
 * @author GK
 * @version 创建时间：2019-5-29 上午9:53:38
 * @ClassName 类名称
 * @Description 类描述 删除链表中等于给定值 val 的所有节点。
 */
public class RemoveLinkedListElements extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.addNode(2);
		node.addNode(6);
		node.addNode(2);
		node.addNode(5);
		node.addNode(2);
		node.addNode(4);
		node.addNode(2);

		System.out.println(removeElements(node, 2).toString());

	}

	public static ListNode removeElements(ListNode head, int val) {
		//最傻的删除办法
//		ListNode temp = head;
//		while (temp.next != null) {
//			temp = temp.next;
//			if (temp.val == val) {
//				deleteNode(head, val);
//			}
//		}
//
//		return head;
 
		//递归 效率最高 我却看不懂
//			if(head == null){
//				return head;
//			}
//
//			head.next = removeElements(head.next, val);
//
//			return head.val == val ?head.next:head;

		//创建另外一个对象 跟这个对象数据一样  但是创建的对象变动了 原始对象不会变动...换元
		ListNode p = new ListNode(-1);
		p.next = head;
		ListNode q = p;
		while (q.next != null) {
				if(q.next.val == val){
					q.next = q.next.next;
				}else{
					q = q.next;
				}
		}
		return p.next;
		//还有一种解法  把不等于val的值  放入一个新的链表 还是用换元法  递归最好用 直接背代码吧
	}

	private static void deleteNode(ListNode head, int val) {
		ListNode temp = head;
		int n = 0;
		while (true) {
			n++;
			temp = temp.next;
			if (temp.val == val) {
				if (temp.next == null) {
					deleteLastOne(head, n - 1);
					return;
				} else {
					temp.val = temp.next.val;
					temp.next = temp.next.next;
					return;
				}
			}

		}
	}

	private static void deleteLastOne(ListNode temp, int i) {
		for (int j = 0; j < i; j++) {
			temp = temp.next;
		}
		temp.next = null;
	}

}
