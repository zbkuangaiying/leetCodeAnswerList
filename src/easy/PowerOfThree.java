package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-1 下午4:58:38
 * @ClassName 类名称
 * @Description 类描述
 */
public class PowerOfThree extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}

	  public static boolean isPowerOfThree(int n) {
//	        return n > 0 && 1162261467 % n == 0; 
		  
		  // n = Mathh.pow(3,i);
		  // i = 	log3(n)  i是以3为底 数n的指数
		  // i = logb(n)/longb(3)  
		  double a = (double) Math.log10(3);
		  double b = (double) Math.log10(n);
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(b/a);
		  return b/a % 1 == 0;
	    }
}
