package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-2 上午9:26:21
 * @ClassName 类名称
 * @Description 类描述
 */
public class PowerOfFour extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	  public static boolean isPowerOfFour(int n){
		  return (n&n-1) == 0 && (n&0xaaaaaaaa) == 0 ;
	  }
}
