package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-5-8 上午9:13:02
 * @ClassName 类名称
 * @Description 类描述 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *              本题中，我们将空字符串定义为有效的回文串。
 * 
 *              输入: "A man, a plan, a canal: Panama" 输出: true 输入: "race a car"
 *              输出: false
 */
public class ValidPalindrome extends LeetcodeEasyLevel {
	static char[] map = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','v','x','y','z',
		'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
		'0','1','2','3','4','5','6','7','8','9'};
	public static void main(String[] args) {
		String str = "A man, a plan, a canal: Panama";

		System.out.println(str + "是回文串吗--------->" + isPalindrome(str));
	}

	public static boolean isPalindrome(String s) {
		if(s == null){
			return false;
		}
		if(s.length() == 0){
			return true;
		}
		char[] chars = s.toCharArray();
		int i, j ;
		boolean  flag = false ;
		for (i = 0,j =chars.length-1;i<j;) {
			char a = chars[i];
			char b = chars[j];
			if(!isInMap(a)){
				i++;
				continue;
			}
			if(!isInMap(b)){
				j--;
				continue;
			}
			String stra = (a+"").toLowerCase();
			String strb = (b+"").toLowerCase();
			flag = stra.equals(strb);
			if(!flag){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean isInMap(char c){
		for (int i = 0; i < map.length; i++) {
            if (c == map[i]) {
                return true;
            }
        }
        return false;
	}

//	public static boolean isPalindrome(String s) {
//		if (s == null) {
//			return false;
//		}
//
//		List<String> list = new ArrayList<>();
//		char[] chars = s.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= '0' && chars[i] <= '9')) {
//				list.add(chars[i] + "");
//			}
//		}
//		String[] strs = new String[list.size()];
//		for (int i = 0; i < strs.length; i++) {
//			strs[i] = list.get(i);
//		}
//		boolean b = false;
//		if (s.length() == 0 || strs.length == 0) {
//			return true;
//		}
//		for (int i = 0; i < strs.length; i++) {
//			b = strs[i].toLowerCase().equals(strs[strs.length - 1 - i].toLowerCase());
//			if (!b) {
//				break;
//			}
//		}
//		return b;
//	}
}
