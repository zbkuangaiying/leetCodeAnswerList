package easy;
/**
 * @author GK
 * @version 创建时间：²019-5-²8 上午9:10:²9
 * @ClassName 类名称
 * @Description 类描述
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，
 * 然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * 
 * 输入: 19
 * 输出: true
 * 解释: 
 * 1² + 9² = 82
 * 8² + 2² = 68
 * 6² + 8² = 100
 * 1² + 0² + 0² = 1
 */
public class HappyNumber {

	static int[] wrongNumbers = new int[]{4,16,37,58,89,145,42,20};
	public static void main(String[] args) {
		int n = 19;
		System.out.println(isHappy(n));
	}
	
	
	
	  public static boolean isHappy(int n) {
//	        while (n != 1) {
//	        	 n = calculNumber(n);
//				if(compare(n)){
//					return false;
//				}
//			}
//	        return true;
		  
		  if(n == 1){
			  return true;
		  }
		  int sum = 0;
		  int x = n;
		  while (x != 1) {
			  x = calculNumber(x);
			  if(x == n){ return false;}
			  if(x == 4){return false;}
		}
		  return true;
		  
	    }
	  
	  public static int calculNumber(int n){
		  if(n == 0){return 0;}
		  if(n == 1){return 1;}
		  int sum = 0;
		  while (n > 0) {
			int i = n%10;
			sum += i*i;
			n = n/10;
		}
		  return sum;
	  }
	  
	  public static boolean compare(int n){
		 for (int i = 0; i < wrongNumbers.length; i++) {
			if(n == wrongNumbers[i]){
				return true;
			}
		} 
		 return false;
	  }
}
