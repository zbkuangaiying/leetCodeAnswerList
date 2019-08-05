
package easy;
/**
 * @author GK
 * @version 创建时间：2019-8-5 下午2:16:56
 * @ClassName 类名称
 * @Description 类描述
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * 
 */
public class ArrangingCoins extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
	}
	
	public static int arrangeCoins(int n) {
	       // int i = 1;
	       //  int zongxiaohao = 0;
	       // for(; i <= n-zongxiaohao;i++){
	       //     zongxiaohao+=i;
	       // }
	       //  return i-1;
		
	        //前n项和的通项公式 x(x+1)/2 = n;
	        //x(x+1) = 2n
	        //x²+x = 2n
	        //x²+x + 1/4 = 2n+ 1/4 ;
	        //(x+1/2)² = 2n+ 1/4;
	        //两边同时开平方
	        //sqrt(2n+0.25) = x+0.5
	        //x = sqrt(2n+0.25)-0.5;
			long l = n;
	        return  (int) (Math.sqrt((double)(2*l+0.25))-0.5d);
	    }

}
