package easy;

import java.util.HashSet;

/**
 * @author GK
 * @version 创建时间：2019-5-10 上午9:26:54
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个链表，判断链表中是否有环
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 */
public class LinkedListCycle extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		ListNode p = new ListNode(3);
		p.addNode(2);
		p.addNode(0);
		p.addNode(4);
		ListNode q = p.getLastOne();
		System.out.println(q.toString());
		p.getLastOne().next = p.next;
		System.out.println(hasCycle(p));
	}

		public static boolean hasCycle(ListNode p) {
        HashSet<ListNode> set = new HashSet<>();
        while (p != null) {
        	if(set.contains(p)){
	        	return true;
	        }else{
	        	set.add(p);
	        }
        	p = p.next;
		}
	        return false;
		}	
}
