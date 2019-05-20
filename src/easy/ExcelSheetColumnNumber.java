package easy;

import java.util.HashMap;

/**
 * @author GK
 * @version 创建时间：2019-5-20 上午9:18:36
 * @ClassName 类名称
 * @Description 类描述
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 */
public class ExcelSheetColumnNumber extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		String columnName = "NCA";
		System.out.println(titleToNumber(columnName));
		
		
	}
	
	 public static int titleToNumber(String s) {
//			HashMap<String,Integer> map = new HashMap<>();
//			addAll(map);
//	        if(s.isEmpty()){
//	        	return 0;
//	        }
//	        int times = 0;
//	        int result = 0;
//	        for (int i = s.length()-1; i >= 0 ; i--) {
//				char c = s.charAt(i);
//				if(times == 0){
//					result += map.get(c+"");
//				}else{
//					int jinwei = (int) Math.pow(26,times);
//					result += map.get(c+"")*jinwei;
//				}
//				times++;
//			}
//	        return result;
		 
		  int sum=0,len=s.length();
	        if(s==null||s.length()==0)return 0;
	        int i=0;
	        while(len>i){
	            char c=s.charAt(i);
	            sum=sum*26+c-'A'+1;
	            i++;
	        }
	        return sum;
	 }

	private static void addAll(HashMap<String, Integer> map) {
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		map.put("F", 6);
		map.put("G", 7);
		map.put("H", 8);
		map.put("I", 9);
		map.put("G", 10);
		map.put("K", 11);
		map.put("L", 12);
		map.put("M", 13);
		map.put("N", 14);
		map.put("O", 15);
		map.put("P", 16);
		map.put("Q", 17);
		map.put("R", 18);
		map.put("S", 19);
		map.put("T", 20);
		map.put("U", 21);
		map.put("V", 22);
		map.put("W",23);
		map.put("X", 24);
		map.put("Y", 25);
		map.put("Z", 26);		
	}
}
