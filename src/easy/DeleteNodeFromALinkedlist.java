package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-17 下午2:45:22
 * @ClassName 类名称
 * @Description 类描述
 */
public class DeleteNodeFromALinkedlist extends LeetcodeEasyLevel{

	public static void main(String[] args) {
		
	}
	
	public static void deleteNoed(ListNode p){
		p.val = p.next.val;
		p.next = p.next.next;
	}
}
