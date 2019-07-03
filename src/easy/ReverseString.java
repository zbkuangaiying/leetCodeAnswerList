package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-3 上午10:32:43
 * @ClassName 类名称
 * @Description 类描述
 */
public class ReverseString extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
	}
	
    public static void reverseString(char[] chars) {
    	int left = 0;
    	int right = chars.length-1;
    	int mid = chars.length/2;
    	while(left < mid){
    		char c = chars[left];
    		chars[left] = chars[right];
    		chars[right] = c;
    		left++;
    		right--;
    	}
    	
    	
    }

}
