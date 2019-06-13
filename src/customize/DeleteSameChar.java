package customize;

import java.util.Arrays;

import easy.LeetcodeEasyLevel;

/**
 * @author GK
 * @version 创建时间：2019-5-7 下午1:51:59
 * @ClassName 类名称
 * @Description 类描述
 */
public class DeleteSameChar extends LeetcodeEasyLevel{
	
	public static void main(String[] args) {
//		String str = "abcdeeeeeeffacss";
//		System.out.println(deleteSamechar(str));
//		System.out.println(deleteSameCharLeftOne(str));
		Primes(30);
	}

	private static void Primes(int max) {
		int[] nums = new int[max];
		int count = 2;
		for (int i = 2; i < max; i++) {
			nums[i] =i;
		}
		
		for (int i = 2; i *i < max; i++) {
				for (int j = i*i; j < max; j+=i) {
					if(nums[j] != 0){
						nums[j] = 0;
						count ++;
					}
				}
			}
			
		System.out.println(Arrays.toString(nums));
		

		System.out.println(max-count);
		count = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0){
				count ++;
			}
		}
		System.out.println(count);
	}

	private static String deleteSameCharLeftOne(String str) {
		// TODO Auto-generated method stub
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < chars.length-1; i++) {
			if(chars[i] != chars[i+1]){
				sb.append(chars[i]);
			}
		}
			sb.append(chars[chars.length - 1]);
		
		return sb.toString();
	}

	private static String deleteSamechar(String str) {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		char c = 0 ;
		for (int i = 0; i < chars.length-1; i++) {
			if(chars[i] == chars[i+1]){
				c = chars[i];
				sb.append(" ");
			}else{
				 if(c != 0 && chars[i] == c){
					 sb.append(" ");
				 }else{
					 sb.append(chars[i]);
				 }
			}
		}
		if(chars[chars.length-1] == chars[chars.length-2]){
			return sb.toString().replace(" ", "");
		}else{
			sb.append(chars[chars.length-1]);
			return sb.toString().replace(" ", "");
		}	
	}

}
