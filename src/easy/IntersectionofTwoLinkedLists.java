package easy;
/**
 * @author GK
 * @version 创建时间：2019-5-14 上午9:16:56
 * @ClassName 类名称
 * @Description 类描述
 *	编写一个程序，找到两个单链表相交的起始节点。
 * 	3思路 1 set 2 找到长度 从长的坐标:长的与短的的差值   开始往后遍历, 3 a.sizeb.size = b.size+a.zise  这个思路简直爆炸
 */
public class IntersectionofTwoLinkedLists extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		ListNode p = new ListNode(4);
		p.addNode(1);
		p.addNode(8);
		p.addNode(5);
		p.addNode(4);
		ListNode q = new ListNode(5);
		q.addNode(0);
		q.addNode(1);
		q.addNode(8);
		q.addNode(5);
		q.addNode(4);
		
		System.out.println(getIntersectionNode(p, q));
	}
	
	 public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        
		 if(headA == null || headB == null){return null;};
		 ListNode pA = headA,pB = headB;
		 while(isEquals(pA,pB) ){
			 pA = pA == null ? headB : pA.next;
			 pB = pB == null ? headA : pB.next;
		 }
		 return pA.next;
	 }

}
