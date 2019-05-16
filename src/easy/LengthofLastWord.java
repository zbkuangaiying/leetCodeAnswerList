package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-11 上午9:26:43
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 
 * 输入: "Hello World"
 * 输出: 5
 * 
 */
public class LengthofLastWord extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		String str = "hello world ";
		str = "a ";
		int length = lengthOfLastWord(str);
		System.out.println(length);
	}

	
	   public static int lengthOfLastWord(String s) {
	        if(isEmpty(s)){
	        	return 0;
	        }
	       boolean  isHavaSpace = false;
	        for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == ' ' ){
					isHavaSpace =true;
					break;
				}
			}
	        if(!isHavaSpace){
	        	return s.length();
	        }
	        int length = 0;
	        for (int i = s.length()-1; i >= 0; i--) {
	        	char c = s.charAt(i);
					if(c  == ' '){
					s = s.substring(0,i);
				}else{
					break;
				}
			}
	        
	        for (int i = s.length()-1; i >= 0; i--) {
	        	char c = s.charAt(i);
				if(c  != ' '){
					length++;
				}else{
					break;
				}
			}
	        return length;
	    }
}
