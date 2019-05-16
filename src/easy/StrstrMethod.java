package easy;

/**
 * @author GK
 * @version 创建时间：2019-4-8 上午9:03:51
 * @ClassName 类名称
 * @Description 类描述
 * 
 *              实现 strStr() 函数。 给定一个 haystack 字符串和一个 needle 字符串，在 haystack
 *              字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * 
 *              输入: haystack = "hello", needle = "ll" 输出: 2
 * 
 *              输入: haystack = "aaaaa", needle = "bba" 输出: -1
 * 
 *              说明: 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 对于本题而言，当 needle
 *              是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */
public class StrstrMethod extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		String haystack = "mississippi";
		String needle = "issip";
		int index = Strstr(haystack, needle);
		System.out.println(index);
	}

	private static int Strstr(String haystack, String needle) {
		// TODO Auto-generated method stub
		if (isEmpty(haystack) && isEmpty(needle)) {
			return 0;
		}else if(isEmpty(haystack) && !isEmpty(needle) ){
			return -1;
			}else if(!isEmpty(haystack) && isEmpty(needle) ){
				return 0;
			}
			
		
		int haystackLength = haystack.length();
		int needleLength = needle.length();

		int index = 0;
	
		while (haystackLength >= needleLength) {
			if (index >= haystack.length()) {
				return 0;
			}
			char a = haystack.charAt(index);
			char b = needle.charAt(0);
			int result = index;
			boolean flag = true;
			if (a == b) {
				inner: for (int i = 1; i < needleLength; i++) {
					result++;
					if (result >= haystack.length()) {
						flag = false;
						break inner;
					}
					char c = haystack.charAt(result);
					char d = needle.charAt(i);
					if (c != d) {
						flag = false;
						index++;
						haystackLength--;
						break inner;
					} else {
						continue;
					}
				}
				if (flag) {
					return index;
				}
			} else {
				index++;
				haystackLength--;
			}

		}
		return -1;
	}

}
