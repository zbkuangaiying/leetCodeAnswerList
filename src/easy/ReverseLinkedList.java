package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author GK
 * @version 创建时间：2019-6-3 上午10:40:30
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 反转一个单链表。
 */
public class ReverseLinkedList extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		ListNode  p = new ListNode(1);
		p.addNode(2);
		p.addNode(3);
		p.addNode(4);
		p.addNode(5);
		
		System.out.println(reverseList(p));
	}
	
	
    public static ListNode reverseList(ListNode head) {
    	//iteration 
//    	ListNode p = head;
//    	ListNode q = null;
//    	while (p != null) {
//    		System.out.println(q);
//			ListNode curr = p.next;
//			p.next = q;
//			q = p;
//			p = curr;
//		}
//    	return q; 
    	//recursion   hard to comprehend
    	if(head == null || head.next == null){ return head;}
    	ListNode p = reverseList(head.next);
    	head.next.next = head;
    	head.next = null;
    	return p;
    }
}
