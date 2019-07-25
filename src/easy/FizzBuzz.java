package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-7-25 上午10:40:50
 * @ClassName 类名称
 * @Description 类描述
 */
public class FizzBuzz extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(16));
	}

	public static List<String> fizzBuzz(int n) {
	      List<String> list = new ArrayList<>();
			String str1 = "Fizz";
			String str2 = "Buzz";
			for (int i = 1; i <= n; i++) {
				if (i % 15 == 0 && i >= 15) {
					list.add(str1 + str2);
				} else if (i % 3 == 0) {
	                list.add(str1);
				} else if (i % 5 == 0) {
	                list.add(str2);
				} else {
					list.add(String.valueOf(i));
				}
			}
			return list;

	}

}
