package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-19 上午10:15:12
 * @ClassName 类名称
 * @Description 类描述
 */
public class NthDigit extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
		
	}
	
	 public static int findNthDigit(int n) {
         n--;//从0开始
          int first = 1, digits = 1;
          /**
           * 1-9/10-99/100-999/...
           * first 是每组的第一个值
           * digit 是每组的数的位数
           * 每组的总位数9*first*digits
           *
           * while寻找n属于哪个组
           */

          while (n/9/first/digits>=1){//n>=9*first*digits,保证不会溢出
              n-=9*first*digits;
              digits++;
              first*=10;
          }

          /**
           * first为n所属组的第一个数，n/digits当前组的第几个数，n%digits为这个数的第几位
           */
          return (first + n/digits + "").charAt(n%digits) - '0';
    }

}
