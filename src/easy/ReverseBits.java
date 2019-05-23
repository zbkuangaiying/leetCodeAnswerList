package easy;
/**
 * @author GK
 * @version 创建时间：2019-5-23 上午9:20:20
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 颠倒给定的 32 位无符号整数的二进制位。
 * 
 * 输入: 00000010100101000001111010011100
 * 输出: 00111001011110000010100101000000
 *
 * 解释: 输入的二进制串 00000010100101000001111010011100 表示无符号整数 43261596，
 * 因此返回 964176192，其二进制表示形式为 00111001011110000010100101000000。
 */
public class ReverseBits extends LeetcodeEasyLevel {


	static int n = 43261596;
	public static void main(String[] args) {
		System.out.println(reverseBits(n));
	}
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i <= 32; i++) {
        	//原数字右移i位
			int temp = n >> i;
        	//得到结果对1取and  要么是1 要么是0 奇数为1 偶数为0
        	temp = temp&1; 
        	//把这个结果左移31-i位
        	temp = temp << (31-i);
        	//左移之后的值 与上一次的值进行|运算
        	//001000000
        	//001100000
        	//结果是0011000000
        	result = result | temp;
		}
        return result;
        
    }
	
}
