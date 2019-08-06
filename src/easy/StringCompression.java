package easy;
/**
 * @author GK
 * @version 创建时间：2019-8-6 下午5:36:40
 * @ClassName 类名称
 * @Description 类描述
 * 字符串压缩 滑动窗口法..
 */
public class StringCompression extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	 public static  int compress(char[] chars) {
	        int start = 0;
	        int size = 0;
	        for(int end = 0 ; end <= chars.length ; end++){
	            if( end == chars.length || chars[start] != chars[end]){
	            	size++;
	            	if((end - start) > 1){
	            		for (char c : String.valueOf(end - start).toCharArray()) {
							chars[size++] = c;
						}
	            	}
	            	start = end;
	            }
	        }
	        return size;
	    }
}
