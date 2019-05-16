package easy;
/**
 * @author GK
 * @version 创建时间：2019-3-29 上午9:27:27
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 输入: 121   输出: true
 * 输入: -121	输出: false		解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 输入: 10		输出: false		解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 
 * 
 */
public class PalindromeNumber {
	

	public static void main(String[] args) {
		int integer = 12321;
		System.out.println(isPalindrome(integer));
	}

	/**
	 * 按照常理 完全反转之后跟原来的数比较就是了
	 * 
	 * 后来一想 截取一半跟原来的数比较也行  如果是奇数  那就除以10再跟原来的数比较呗
	 * 
	 * 截取条件大概就是 翻转的数如果比原先的数大了 就没必要循环了。。。
	 * 
	 * @param x
	 * @return
	 */
	private static boolean isPalindrome(int x) {
		// TODO Auto-generated method stub
		if(x < 0 || (x % 10 == 0 && x != 0) ){
			return false;
		}
		if(x >= 0 && x < 10 ){
			return true;
		}
		
		int result = 0;
		while (x > result) {
			result = result*10+ x %10;
			x = x/10;
			
		}
		return  result == x || x == result/10;
	}


}
