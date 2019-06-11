package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-10 下午2:07:20
 * @ClassName 类名称
 * @Description 类描述
 */
public class PowerofTwo extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	  public static boolean isPowerOfTwo(int n) {
	        return n>0 && (n&(n-1)) == 0;
	    }
}
