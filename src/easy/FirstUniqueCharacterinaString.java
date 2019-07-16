package easy;

import java.util.HashMap;
import java.util.Map;


/**
 * @author GK
 * @version 创建时间：2019-7-15 上午9:45:38
 * @ClassName 类名称
 * @Description 类描述
 */
public class FirstUniqueCharacterinaString extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
//		System.out.println(firstUniqChar("loveleetcode"));
	}
	
	  public static int firstUniqChar(String s) {
		  Map<Character,Integer> map = new HashMap<>();
		  int n = s.toCharArray().length;
		  for (int i = 0; i <n; i++) {
			  char c = s.charAt(i);
			  if(map.containsKey(c)){
				  int j = map.get(c);
				  map.put(c,j+1);
			  }else{
				  map.put(c, 1);
			  }
		}
		  for (int i = 0; i < n; i++) {
			  if(map.get(s.charAt(i)) == 1){
				 return i;
			  }
		}
		  return -1;
		  //这个超出时间限制
//	    String str1 = "";
//	    for (int i = 0; i < s.toCharArray().length; i++) {
//			str1 = s.charAt(i)+"";
//			String replaceAll = s.replaceAll(str1, "");
//			if(s.length()-replaceAll.length() == 1){
//				return i;
//			}
//		}
//	     return -1;
	    }

}
