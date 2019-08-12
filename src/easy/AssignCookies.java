package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-8-12 下午10:16:54
 * @ClassName 类名称
 * @Description 类描述
 */
public class AssignCookies extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int left = 0; int right = 0;
		while(left < g.length && right < s.length){
			if(g[left] <= s[right++]){
				left++;
			}
		}
		return left;
	}
}
