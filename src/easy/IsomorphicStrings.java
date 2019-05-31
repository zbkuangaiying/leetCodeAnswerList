package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GK
 * @version 创建时间：2019-5-31 上午9:09:39
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * 
 * 示例 1:
 * 输入: s = "egg", t = "add" 输出: true
 * 示例 2:
 * 输入: s = "foo", t = "bar" 输出: false
 * 示例 3:
 * 输入: s = "paper", t = "title" 输出: true
 * 
 * 映射法!  碉堡了
 * map.put(p,t)
 * map.put(a,i)
 * map,put(p,t)
 * map.put(e,l)
 * map.put(r,e)
 * 
 * map的key如果存在了 则判断对应的value是否是上一次存的..如果是则是同构 不是就不是同构
 * 
 * 这个不好使.....
 * 
 * 现在用下标确认法  有点绕
 * e g g 
 * a d d 
 * 循环第一次  e在字符串中第一次出现的下标是0  a在字符串中第一次出现的下标是0
 * 循环第二次  g在字符串中第一次出现的下标是1  d在字符串中第一次出现的下标是1
 * 循环第三次  g在字符串中第一次出现的下标是2  d在字符串中第一次出现的下标是2 
 * return true
 * f o o
 * b a r 
 * 循环第一次  f在字符串中第一次出现的下标是0  b在字符串中第一次出现的下标是0
 * 循环第二次  o在字符串中第一次出现的下标是1  a在字符串中第一次出现的下标是1
 * 循环第三次  o在字符串中第一次出现的下标是1  r在字符串中第一次出现的下标是2 
 * return false
 * 
 * 
 * the first time i saw this mind   i could't understand it
 * after trying some other ways, i started to understand this mind
 * i'am stupid so much
 * i think my IQ is even not better than an orangutan
 * 
 */
public class IsomorphicStrings extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		String s = "ac";
		String t = "ab";
		System.out.println(isIsomorphic(s,t));
	}
	
	
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
        	return false;
        }
        if(s.length() == 0 && t.length() == 0){
        	return true;
        }
       for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i)) ){
				return false;
			}
	}
        return true;
    }
}
