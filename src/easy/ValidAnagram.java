package easy;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import android.R.fraction;

/**
 * @author GK
 * @version 创建时间：2019-6-18 下午4:47:14
 * @ClassName 类名称
 * @Description 类描述
 */
public class ValidAnagram extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		
		// 嗯 6ms got it!
		if (s.length() != t.length()) {
			return false;
		}
		char[] charT = t.toCharArray();
		char[] charS = s.toCharArray();
		int[] count = new int[26];
		for (int i = 0; i < s.length(); i++) {
			count[charT[i] - 'a']++;
			count[charS[i] - 'a']--;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
		// 嗯 这个有点犀利. 11ms let's go on!
//		if (s.length() != t.length()) {
//			return false;
//		}
//		int[] count = new int[26];
//		for (int i = 0; i < s.length(); i++) {
//			count[s.charAt(i) - 'a']++;
//			count[t.charAt(i) - 'a']--;
//		}
//		for (int i = 0; i < count.length; i++) {
//			if (count[i] != 0) {
//				return false;
//			}
//		}
//		return true;
		
		// 13ms 击败了38% 有点丢人 干下一个
		// char[] charT = t.toCharArray();
		// char[] charS = s.toCharArray();
		// Arrays.sort(charS);
		// Arrays.sort(charT);
		// return Arrays.equals(charS, charT);
	}
}
