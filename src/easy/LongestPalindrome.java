package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GK
 * @version 创建时间：2019-7-24 下午1:57:35
 * @ClassName 类名称
 * @Description 类描述
 */
public class LongestPalindrome extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		String s = "abbbbcccccdda";
		System.out.println(longestPalindrome(s));
	}
	
    public static int longestPalindrome(String s) {
    	
        int result = 0;
        int[] counts = new int[128];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        	counts[chars[i]]++;
		}
        
        for (int i = 0; i < counts.length; i++) {
			result += counts[i]/2*2;
			if(counts[i] % 2 == 1 && result %2 == 0){
				result ++;
			}
		}
//        Map<Character,Integer> map = new HashMap<>();

//        for (int i = 0; i < s.length(); i++) {
//        	char c= s.charAt(i);
//			if(map.containsKey(c)){
//				int j = map.get(c);
//				map.put(c,j+=1);
//			}else{
//				map.put(c, 1);
//			}
//		}
//        System.out.println(map.toString());
//        for (Integer i : map.values()) {
//			 result += i/2*2;
//			 if(i%2 == 1 && result % 2 == 0){
//				 result += i;
//			 }
//		}
//        
        return result;
    }
}
