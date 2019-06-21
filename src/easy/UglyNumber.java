package easy;

/**
 * @author GK
 * @version 创建时间：2019-6-21 上午9:21:53
 * @ClassName 类名称
 * @Description 类描述
 */
public class UglyNumber extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}

	public static boolean isUgly(int num) {

		if (num <= 0) {
			return false;
		}
		if (num == 1) {
			return true;
		}

		if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
			return false;
		}

//		while (num != 1) {
			if ((num & 1) == 0) {
				num = num >> 1;
			} else if (num % 3 == 0) {
				num = num / 3;
			} else if (num % 5 == 0) {
				num = num / 5;
			} else {
				return false;
			}
//		}
		return isUgly(num);

	}

}
