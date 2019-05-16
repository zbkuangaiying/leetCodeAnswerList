package easy;

import java.util.Arrays;

/**
 * @author GK
 * @version 创建时间：2019-4-15 上午9:20:44
 * @ClassName 类名称
 * @Description 类描述
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 * 输入为非空字符串且只包含数字 1 和 0。
 * 
 * 输入: a = "11", b = "1"				输出: "100"
 * 输入: a = "1010", b = "1011"	输出: "10101"
 */
public class AddBinary extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
//		String a = "1111";
//		String b = "1111";
//		System.out.println(a+"+"+b+"的结果是---->"+addBinary(a, b));
		String str = "120.00";
		int amount = (int)Double.parseDouble(str);
//		System.out.println(formateRate(str));
		System.out.println(Long.parseLong(amount+""));
	}

    public static String addBinary(String a, String b) {
    	if(isEmpty(a) || a.equals("0")){
    		return b;
    	}
    	if(isEmpty(b) || b.equals("0")){
    		return a;
    	}
    	
    	int alength = a.length();
    	int blength = b.length();
    	StringBuilder sb = new StringBuilder();
    	int distance = 0;
    	if(alength > blength){
    		//给b前面加0
    		distance = alength - blength;
    		for (int i = 0; i < distance; i++) {
				sb.append("0");
			}
    		sb.append(b);
    		b = sb.toString();
    	}else if(blength > alength){
    		//给a前面加0
    		distance = b.length() - a.length();
    		for (int i = 0; i < distance; i++) {
				sb.append("0");
			}
    		sb.append(a);
    		a = sb.toString();
    	}
    	int jinwei = 0;
    	sb = new StringBuilder();
    	for (int i =  a.length() -1; i >= 0; i--) {
			int p = Integer.parseInt(a.charAt(i)+"");
			int q = Integer.parseInt(b.charAt(i)+"");
			switch (p+q+jinwei) {
			case 3:
				sb.append("1");
				jinwei = 1;
				break;
			case 2:
				sb.append("0");
				jinwei = 1;
				break;
			case 1:
				sb.append("1");
				jinwei = 0;
				break;
			case 0:
				sb.append("0");
				jinwei = 0;
				break;
			default:
				break;
			}
		}
    	if(jinwei == 1){
    		sb.append("1");
    	}
    	return sb.reverse().toString();
    }
    
    
    //格式化 电子化移交完成率 保留两位
    public static String formateRate(String rateStr) {
        if (rateStr.indexOf(".") != -1) {
            //获取小数点的位置
            int num = 0;
            num = rateStr.indexOf(".");

            //获取小数点后面的数字 是否有两位 不足两位补足两位
            String dianAfter = rateStr.substring(0, num + 1);
            String afterData = rateStr.replace(dianAfter, "");
            if (afterData.length() < 2) {
                afterData = afterData + "0";
            } else {
                afterData = afterData;
            }
            return rateStr.substring(0, num) + "." + afterData.substring(0, 2);
        } else {
            if (rateStr == "1") {
                return "100";
            } else {
                return rateStr;
            }
        }
    }
}
