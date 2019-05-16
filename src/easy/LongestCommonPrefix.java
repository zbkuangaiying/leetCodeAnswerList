package easy;

import java.sql.Date;

/**
 * @author GK
 * @version 创建时间：2019-4-1 上午9:22:02
 * @ClassName 类名称
 * @Description 类描述
 * 编写一个函数来查找字符串数组中的最长公共前缀。 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 输入: ["flower","flow","flight"] 	输出: "fl"
 * 输入: ["dog","racecar","car"]		输出: ""		解释: 输入不存在公共前缀
 * 
 */
public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] arr = {"leetcode","lee","leets","leesha"};
		String str = longestCommonPrefix(arr);
		System.out.println(str);
		System.out.println(new Date(1553765843499l));
	}

	
	 public static String longestCommonPrefix(String[] strs) {
		    if (strs.length == 0) return "";
		    String prefix = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while (strs[i].indexOf(prefix) != 0) {
		            prefix = prefix.substring(0, prefix.length() - 1);
		            if (prefix.isEmpty()) return "";
		        }        
		    return prefix;
		}
		 
}
