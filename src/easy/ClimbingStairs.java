package easy;
/**
 * @author GK
 * @version 创建时间：2019-4-17 上午10:14:37
 * @ClassName 类名称
 * @Description 类描述
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？  注意：给定 n 是一个正整数。
 * 输入： 2 输出： 2 解释： 有两种方法可以爬到楼顶。 1.  1 阶 + 1 阶 2.  2 阶
 * 输入： 3 输出： 3 解释： 有三种方法可以爬到楼顶。	1.  1 阶 + 1 阶 + 1 阶	2.  1 阶 + 2 阶	3.  2 阶 + 1 阶
 */ 
public class ClimbingStairs extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		int n = 10;
		int methods = climbStairs(n);
		System.out.println("上"+n+"层楼梯,一共有"+methods+"个方法");
		
	}
    public static  int climbStairs(int n) {
    	if(n ==0) return 0;
    	if(n == 1) return 1;
    	if(n == 2) return 2;   
    	 
    	//最优子结构 边界 最佳状态转移方式  如何分析
    	
    	int a = 1;//第一层的步数       
    	int b = 2;//第二层的步数 
    	int temp = 0;//第三层的步数
    	for (int i = 3; i < n; i++) {
    		temp = a+b;//f(n) = f(n-1)+f(n-2);
			 a = b; // 重新给f(n-2)赋值;
			b = temp;//重新给f(n-1)赋值
		}
    	return temp;
    }
}
