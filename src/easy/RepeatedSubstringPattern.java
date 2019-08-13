package easy;
/**
 * @author GK
 * @version 创建时间：2019-8-13 下午8:07:29
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 检查字符串是否由重复的字符串构成
 * 只需要检查整个字符串长度一半就可以了 换个说法 素数个长度的字符串一定不会由重复的字符串组成
 * 只检查偶数长度的重复字符串
 * 用字符串总长度对当前长度取余  9%2 重复的字符串长度一定不会是2  有余数就证明不可能由重复的子串组成
 * 然后就获得了当前可能是重复子串的长度  假设是3 那我们从3开始逐个往后遍历 与前三个是否相等
 * s[第三个3%余数3] == s[第三个]
 * s[第四个4%余数3] == s[第四个]
 * 以此类推
 * 直到第s长度-1 都相同的时候 就认为此字符串由3个长度的子串组成 返回true
 * 
 * 如果有一个不同 则继续取长度为4的子串 
 * 
 * 以此类推
 * 
 */
public class RepeatedSubstringPattern extends LeetcodeEasyLevel{

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abbabb"));
	}
	
	 public static boolean repeatedSubstringPattern(String s) {
	        int len = s.length(),i=0,t=0;
	        char[] chars = s.toCharArray();
	        for(t =1; t <= len/2; ++t){
	            if(len%t != 0) continue;
	            for(i = t;i < len && chars[i%t] == chars[i];i++){
	                if(i == len -1){
	                    return true;
	                }
	            }
	        }
	        return false;  
	    }
}
