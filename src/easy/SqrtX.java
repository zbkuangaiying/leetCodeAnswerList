package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-16 下午1:51:12
 * @ClassName 类名称
 * @Description 类描述
 * 实现 int sqrt(int x) 函数。计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 
 * 输入: 4	输出: 2
 * 输入: 8	输出: 2	说明: 8 的平方根是 2.82842... 由于返回类型是整数，小数部分将被舍去。
 */
public class SqrtX extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int a = 8;
		double result = mySqrt(a);
		System.out.println(a+"的平方根的整数部分是---->"+result);
	}
	
	
	   public static double mySqrt(int x) {
	        if(x >= 2147483647){
	            return 46340;
	        }
	        double r;
	        if(x <= 1){ return x;}
	        r = (double)x;
	        while(r>x/r){//r是平方根  只要当前的r大于x/平方根 说明r仍然还未接近真正的平方根 
	            r = (r+x/r)/2;// 平方根+x/r的和 等于2平方根 乘以二分之一  就是真正的平方根
	        }
	        //while循环1    while(8>8/8){r = (8+8/8)/2 r= 4}
	        //while循环2   while(4>8/4){r = (4+8/4)/2 r =3}
	        //while循环3   while(3>8/3){r = (3+8/3)/2 r =2}
	        //while循环4   while(2>8/2) 循环条件不满足  取2作为8的平方根
	        
	        //while循环1    while(8>8/8){r = (8+8/8)/2 r= 4.5}
	        //while循环2   while(4.5>8/4.5){r = (4.5+8/4.5)/2 r =3.138888}
	        //while循环3   while(3.138888>8/3.138888){r = (3.138888+8/3.138888)/2 r =2.84378}
	        //while循环4   while(2.82846>8/2.82846){r = (2.82846+8/2.82846)/2 r =2.84378}
	        //while循环4   while(2>8/2) 循环条件不满足  取2作为8的平方根
	        return r;
	    }
}
