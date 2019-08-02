package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.R.plurals;

/**
 * @author GK
 * @version 创建时间：2019-8-2 下午1:04:23
 * @ClassName 类名称
 * @Description 类描述
 */
public class FindAllAnagramsinaString {
	public static void main(String[] args) {
		System.out.println(findAnagrams("ababc", "ab"));
		// System.out.println("abcdef".contains("fe"));
	}

	public static List<Integer> findAnagrams(String s, String p) {
		// 1. 设置两个指针 起始坐标start=0，一个结束坐标end=0
		//
		// 2.建立两个长度为26的int数组，p_letter记录p里面的字母分别都有多少个，between_letter记录两个指针中的字母分别都有多少个
		//
		// 3. 做一个循环，start先不动，拿到end指针对应的字母，between_letter中字母对应的数量加1，并让end自增
		// 4. 判断一下，这个字母的数字是不是比p_letter要多了，如果是，表示出现了下面两种情况中的一种
		//		1.start到end中的字母数量比p的length大,那么肯定至少会有一个字母的数量比p_letter里多
		//		2.start到end的距离小于等于p的length，但是里面的某一个字母比p多
		// 	不管是上述情况中哪一种，start都应该前进，直到这个字母的数量等于p中的字母数量。（做完这一步start和end之间的字母数量一定小于等于p的length）
		//
		// 5. 然后再判断一下，start和end之间的字母数量是不是等于p的length。如果是，表示两个坐标之间的字母和p的字母构成一样
		// 因为第二步中，一出现start和end之间的字母比p多，我们就让start前进，直到这个字母数量等于p里面的数量，确保了没有任何一个字母比p里面多
		// 当start和end之间的字母数量和p里面的一样，且start和end之间没有任何一个字母比p多，就说明他们的字母组成一模一样
		// （因为数量一样的情况下，如果出现某个字母比p少，就一定会有另外一个字母比p多，这是充要条件）
		 List<Integer> list = new ArrayList();
		int start = 0;
		int end = 0;
		int[] p_letter = new int[26];
		int[] between_letter = new int[26];
		for (int i = 0; i < p.length(); i++) {
			p_letter[p.charAt(i)-'a']++;
		}
		while (end < s.length()) {
			int c = s.charAt(end++)-'a';
			between_letter[c]++;
			while (p_letter[c] < between_letter[c] ) {
				between_letter[s.charAt(start++)-'a']--;
			}
			if((end - start) == p.length()){
				list.add(start);
			}
		}
		return list;
	}

	// public static List<Integer> findAnagrams(String s, String p) {
	//
	// List<Integer> list = new ArrayList();
	// if(null == s || s.length() == 0){
	// return list;
	// }
	// if(p.length() > s.length() ){
	// return list;
	// }
	//
	// long pInt = 1;
	// char[] pchars = p.toCharArray();
	// char[] schars = s.toCharArray();
	//
	// if(!makesure(s,pchars)){
	// return list;
	// }
	// for(int i = 0 ; i < pchars.length;i++){
	// pInt *= pchars[i];
	// }
	// for (int i = 0; i <= schars.length-pchars.length; i++) {
	// if(pInt == getSum(i,pchars,schars) ){
	// list.add(i);
	// }
	// }
	// return list;
	// }
	//
	// private static boolean makesure(String s, char[] pchars) {
	// boolean flag = true;
	// for(char c : pchars){
	// if(!s.contains(c+"")){
	// flag = false;
	// break;
	// }
	// }
	// return flag;
	// }
	//
	// private static long getSum(int startIndex,char[] pchars,char[] schars) {
	// long result = 1;
	// int times = 0;
	// while (times != pchars.length) {
	// times++;
	// result*=schars[startIndex];
	// startIndex++;
	// }
	// return result;
	// }

}
