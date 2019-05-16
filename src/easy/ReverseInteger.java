package easy;

/**
 * @author GK
 * @version 创建时间：2019-3-28 上午9:28:44
 * @ClassName 类名称
 * @Description 类描述
 * 
 *              给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。 输入: 123 输出: 321 输入: -123
 *              输出: -321 输入: 120 输出: 21
 * 
 */
public class ReverseInteger {
	public static void main(String[] args) {
		int number = 1234;
		int result = reverse(number);
		// System.out.println(Math.pow(2, 3));
		System.out.println(result);
	}

	private static int reverse(int number) {
		// TODO Auto-generated method stub
		int result = 0;
		while (number != 0) {
			int lastNumber = number % 10;
			number /= 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && lastNumber > 7))
				return 0;
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && lastNumber < -8))
				return 0;
			result = result * 10 + lastNumber;
		}
		return result;
	}

	// /**
	// * 不能用String
	// * @param number
	// * @return
	// */
	// private static int reverse(int number) {
	// if(number >= 0 && number <10 ){
	// return number;
	// }
	//
	// int count = 0;
	// int temp = Math.abs(number);
	// int result = 0;
	// while (temp / 10 != 0) {
	// count ++;
	// temp = temp/10;
	// }
	// temp = Math.abs(number);
	// for (int i = count ; i >= 0; i--) {
	// result += temp%10 * Math.pow(10, i);
	// temp = temp/10;
	// }
	// //没有做边界限制
	// return result;
	// }

}
