package easy;

import java.util.Stack;

/**
 * @author GK
 * @version 创建时间：2019-6-12 上午9:12:56
 * @ClassName 类名称
 * @Description 类描述
 */
public class ImplementQueueusingStacks extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.push(1);
		q.push(2);
		q.peek();
		q.pop();
		System.out.println(q.empty());
		System.out.println(q.a.toString());
		System.out.println(q.b.toString());
	}
	
	public static class MyQueue{
    	Stack<Integer> a;
		Stack<Integer> b;
   /** Initialize your data structure here. */
		public MyQueue() {
			a = new Stack<>();
			b = new Stack<>();
		}

 

    
    /** Push element x to the back of queue. */
    public void push(int x) {
        	a.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        	int len;
			len = a.size();
			for (int i = 0; i < len; ++i) {
				b.push(a.peek());
				a.pop();
			}
			int curr;
			curr = b.pop();
			for (int i = 0; i < len-1; ++i) {
				a.push(b.peek());
				b.pop();
			}
			return curr;
        
    }
    
    /** Get the front element. */
    public int peek() {
        	int len;
			len = a.size();
			for (int i = 0; i < len; i++) {
				b.push(a.peek());
				a.pop();
			}
			int curr;
			curr = b.peek();
			for (int i = 0; i < len; i++) {
				a.push(b.peek());
				b.pop();
			}
			return curr;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        	return a.empty() && b.empty() ;
    }

		
		
		
	}

}
