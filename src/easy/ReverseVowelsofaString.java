package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-4 上午9:10:31
 * @ClassName 类名称
 * @Description 类描述
 */
public class ReverseVowelsofaString extends LeetcodeEasyLevel {
	
	static  char[] chars = new char[]{'a','e','i','o','u','A','E','I','O','U'};
	public static void main(String[] args) {
		String s = "LEETCODE";
		System.out.println(reverseVowels(s));
	}

	  public static String reverseVowels(String s) {
	      
	        int left = 0;
	        int right = s.length()-1;
	        char[] charArray = s.toCharArray();
	        while (left < right) {
	        	char leftc = charArray[left];
	        	boolean leftf = isInChars(leftc);
				if(!leftf){
					left++;
				}else{
				inner:while (right > left) {
						char rightc =charArray[right];
						boolean rightf = isInChars(rightc);
						if(rightf){
							charArray[left] = rightc;
							charArray[right] = leftc;
							right--;
							left++;
							break inner;
						}else{
							right--;
						}
					}
				}
			}
	        return new String(charArray);
	    }

	private static boolean isInChars(char c) {
		for (int i = 0; i < chars.length; i++) {
			 if(c == chars[i]){
				 return true;
			 }
			 continue;
		}
		return false;
	}
}
