package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-10 上午10:10:30
 * @ClassName 类名称
 * @Description 类描述
 */
public class SumofTwoIntegers extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		System.out.println(getSum(8,7));
	}
	
	   public static int getSum(int a, int b) {
		   int and = a&b;
		   int xor = a^b;
		   
		   if(and != 0){
			   and = and << 1;
		   }
		   
		   while ((and&xor) != 0) {
			   int newAnd = and&xor;
			   xor = and^xor;
			   and = newAnd << 1;
		}
		   return and^xor;
	   }
}
