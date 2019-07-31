package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-31 下午1:56:43
 * @ClassName 类名称
 * @Description 类描述
 */
public class NumberofSegmentsinaString extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		System.out.println(countSegments(", , , ,        a, eaefa"));
	}
	
	/**
	 * 上一个char为空并且当前char不为空则我们认为这是一个单词的开始.
	 * 只需要记录单词开始的次数就好了
	 * @param s
	 * @return
	 */
	  public static int countSegments(String s) {
	        if(null == s || s.trim().length() == 0) {
	            return 0;
	        }
	        char[] chars = s.toCharArray();
	        char lastchar = ' ';
	        int result = 0 ;
	        for (char c : chars) {
				if(c != ' ' && lastchar == ' ' ){
					result++;
				}
				lastchar = c;
			}
	       return result; 
	    }
}
