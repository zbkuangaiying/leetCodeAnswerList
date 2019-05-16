package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author GK
 * @version 创建时间：2019-4-2 上午9:09:55
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 注意空字符串可被认为是有效字符串
 * 
 * 输入: "()" 输出: true
 * 输入: "()[]{}" 输出: true
 * 输入: "(]" 输出: false
 * 输入: "([)]" 输出: false
 * 输入: "{[]}" 输出: true
 */
public class ValidParentheses {

	public static void main(String[] args) {
		String str = "(((())))))){)))))))}";
		System.out.println(isValid(str));
	}

	/**
	 * 把右括号当成key  左括号当成value
	 * 当遇到左括号  直接放入栈里
	 * 当遇到右括号  先pop掉栈里的上一个值
	 * 然后 从map里获取这个右括号的value
	 * 如果value 等于左括号.. 继续下一个循环
	 * 如果不相等 则证明字符串不对..
	 * @param str
	 * @return
	 */
	private static boolean isValid(String str) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put(")","(");
		map.put("}","{");
		map.put("]","[");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < str.length(); i++) {
			String c = str.charAt(i)+"";
			if(map.containsKey(c)){
				String value = stack.isEmpty() ?"#" :stack.pop();
				if(!value.equals(map.get(c))){
					return false;
				}
			}else{
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
