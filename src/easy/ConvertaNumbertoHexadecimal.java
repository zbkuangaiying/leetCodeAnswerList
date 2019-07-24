package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-19 上午10:46:49
 * @ClassName 类名称
 * @Description 类描述
 */
public class ConvertaNumbertoHexadecimal extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		System.out.println(toHex(-1));
	}

	
	 public  static String toHex(int num) {
	        if(num == 0)return "0";
	        String a = "0123456789abcdef",b = "";
	        while(num!=0 && b.length() < 8){
	            b = a.charAt(num&0xf)+b;
	            num = num >> 4;
	        }
	        return b;
	    }
}
