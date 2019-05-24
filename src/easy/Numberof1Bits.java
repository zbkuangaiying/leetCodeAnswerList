package easy;
/**
 * @author GK
 * @version 创建时间：2019-5-24 上午9:23:00
 * @ClassName 类名称
 * @Description 类描述
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'
 */
public class Numberof1Bits extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		int i = 00000000000000000000000000001011;
		System.out.println(hammingWeight(i));
	}
	
	
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
    	int result = 0;
    	while (n > 0) {
		
			result += n &  1;
			n =n >> 1 ;
		}
		return result;
        
    }

}
