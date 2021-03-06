package easy;

/**
 * @author GK
 * @version 创建时间：2019-6-13 下午2:38:02
 * @ClassName 类名称
 * @Description 类描述
 * 
 *  No.234 solved

    when i met the question , i  was realized quickly that i can use fast point and slow point to find the middle node,
    and then reverse the slow node, get a new node ;
    then loop the slow half node to get value and compare to this new node's value to get result.

    and i also tryed another method.
    the stupid but easy to understand method.

    first i put all node's value push into a stack and count the node's length.
    then  i  loop the originl node to get the value and compare to the stack's top,
    if they are same, get the next node and stack pop the last one;
    then do compare again until we get result
    and we just need looped  that  half of  node's length

    STACK!
    what a sucks!
    i really like the first way. hard  to spell, easy to  run!

 */
public class PalindromeNode extends LeetcodeEasyLevel{

	public static void main(String[] args) {
		ListNode p = new ListNode(1);
		p.addNode(2);
		p.addNode(2);
		p.addNode(1);
		System.out.println(isPalindrome(p));
	}
	
	
	 public static boolean isPalindrome(ListNode head) {
		 if(head == null){return true;}
	      if(head.next == null){ return true;}
		 //下面是非常规的 入栈对比法..时间复杂度为3/2n 空间复杂度为n  
//		 Stack<Integer> stack = new Stack<>();
//		 int count = 0;
//		 ListNode temp = head;
//		 while (temp != null) {
//			stack.push(temp.val);
//			temp = temp.next;
//			count++;
//		}
//		 for (int i = 0; i < count /2; i++) {
//			if(head.val == stack.peek()){
//				head = head.next;
//				stack.pop();
//				}else{
//					return false;
//				}
//			}
//		 return true;
//		}
//		 
		 //下面的是常规的 快慢针求中点 反转慢针 从头开始比较   时间复杂度为n/2+n/2 空间复杂度为1

	        ListNode slow = head;
			ListNode fast = head;
			 while (fast != null&& fast.next != null) {
				slow = slow.next;
	           fast = fast.next.next;
			}
			 
			 ListNode reverse = reverse(slow);
			 while (reverse != null) {
				 if(reverse.val != head.val){
					 return false;
				 }else{
					 reverse = reverse.next;
					 head = head.next;
				 }
			}
			 return true;
			 
		}


		private static ListNode reverse(ListNode head) {
			// TODO Auto-generated method stub
			if(head == null || head.next == null){ return head;}
	    	ListNode p = reverse(head.next);
	    	head.next.next = head;
	    	head.next = null;
	    	return p;
		}   
	 
	 
}
