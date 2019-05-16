package easy;

import java.util.Stack;

/**
 * @author GK
 * @version 创建时间：2019-5-13 上午9:49:55
 * @ClassName 类名称
 * @Description 类描述
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 
 */
public class MinStack extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(-2);
		s.push(0);
		s.push(-3);
		System.out.println(s.getMin());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.getMin());
		
	}
	
	
	Stack<Integer> stack;

	    public MinStack() {
	    	stack = new Stack<>();
	    }
	    
	    public void push(int x) {
	        if(stack.isEmpty()){
	        	stack.push(x);
	        	stack.push(x);
	        }else{
	        	int i = stack.peek();
	        	stack.push(x);
	        	if(i < x){
	        		stack.push(i);
	        	}else{
	        		stack.push(x);
	        	}
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	        stack.pop();
	    }
	    
	    public int top() {
			return stack.get(stack.size()-2);
	        
	    }
	    
	    public int getMin() {
			return stack.peek();
	}

}
