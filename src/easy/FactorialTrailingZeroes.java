package easy;

import java.math.BigInteger;

/**
 * @author GK
 * @version 创建时间：2019-5-21 上午9:15:24
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 5! 1*2*3*4*5 = 2*5*3*4 = 10 * 12 = 120 1个0
 * 10! 1*2*3*4*5*6*7*8*9*10 = (2*5) * 3*4 * 6*7*8*9*(1*10) = 12*42*72*10*10 = 2*2*2 尾数一定是8 而不会是0
 * 因此 只需要查询在阶乘中每个能被5整除的个数就OK
 * 10! 10/5 = 2
 * 15! 15/5 = 3
 * 20! 20/5 = 4
 * 25! 25/5 = 5  ???? 这里还有一个....还能再乘以一次5   需要继续除下去 5/5 = 1   因此  25! = 25/5+5/5 = 6 125同理
 * 
 * 
 */
public class FactorialTrailingZeroes extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		long l = trailingZeroes(6);
		System.out.println(l);
		
		double d = 0;
//		d = (1-0.52);
//		System.out.println(d);
//		d = d*(1-0.50);
//		System.out.println(d);
//		d = d*(1-0.50);
//		System.out.println(d);
//		d = d*(1-0.80);
//		System.out.println(d);
//		d = d*(1-0.25);
//		System.out.println(d);
//		d = d*(1-0.17);
//		System.out.println(d);
		d = (1- 0.52)*(1-0.50)*(1-0.50)*(1-0.80)*(1-0.25)*(1-0.17);
		System.out.println(d);
	}

	 public static  int trailingZeroes(int n) {
	        if(n < 5){
	        	return 0;
	        }
	        int count = 0;
	        while(n >= 5){
	        	count += n/5;
	        	n = n / 5;
	        }
	        return count;
	        
	    }
	
}
