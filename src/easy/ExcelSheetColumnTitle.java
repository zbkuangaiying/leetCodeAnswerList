package easy;
/**
 * @author GK
 * @version 创建时间：2019-5-16 上午10:17:14
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 * 输入: 1 输出: "A" 输入: 28 输出: "AB"
 */
public class ExcelSheetColumnTitle extends LeetcodeEasyLevel {

	static char[]  chars  = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public static void main(String[] args) {
		int currInt = 24568;
		System.out.println(convertToTitle(currInt));
		
	}
	
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 26) {
        	n--;
        	int m = n % 26;
        	n = n/26;
        	sb.append(chars[m]);
		}
        sb.append(chars[n-1 < 0 ?  0 : n-1]);
        return sb.reverse().toString();
    }
}
