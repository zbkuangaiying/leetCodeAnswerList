package mid;

/**
 * @author GK
 * @version 创建时间：2019-3-27 上午9:07:08
 * @ClassName 类名称
 * @Description 
 * 
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * 72+65
 */
public class twoSumWithNode {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		node1.next = new ListNode(7);
		node1 = node1.next;
//		node1.next = new ListNode(3);
//		node1 = node1.next;
//		
		ListNode node2 = new ListNode(5);
		
		node2.next = new ListNode(6);
		node2 = node2.next;
//		node2.next = new ListNode(4);
//		node2 = node2.next;
		
		System.out.println(node1);
		System.out.println(node2);
		
		ListNode node3 = addTwoNumbers(node1,node2);
		System.out.println(node3);
	}
	
	 public static ListNode addTwoNumbers(ListNode node1, ListNode node2) {
		 if(node1 == null){
			 return node2;
		 }
		 if(node2 == null){
			 return node1;
		 }
		 	ListNode p = node1;
		 	ListNode q = node2;
		 	int sum = 0;
		 	ListNode current = new ListNode(0);
	        while(p != null && q != null){
	        	
	        	int x = p != null ? p.val:0;
	        	int y = q != null ? q.val:0;
	        	
	        	int result = sum+x+y;
	        	sum = result / 10;
	        	result = result%10;
	        	
	        	current.next = new ListNode(result);
	        	current  = current.next;

	        	if(p != null ){p = p.next;}
	        	if(q != null ){q = q.next;}
	        
	        }
	      if(sum > 0){
	    	  current.next = new ListNode(sum);
	      }
	      return current.next;
	    }
	
	public static class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
}
