package easy;


/**
 * @author GK
 * @version 创建时间：2019-7-17 上午9:29:10
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定两个字符串 s 和 t，它们只包含小写字母。字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 
 * 这道题就是 一个数组只有一个数字出现一次 其余都出现两次的等价的  时间复杂度为n 遍历一遍就完事了
 */
public class FindtheDifference extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
	}
	
    public static char findTheDifference(String s, String t) {
//      int[] tsrc = new int[26];
//      int[] ssrc = new int[26];
     
//      for(char c : t.toCharArray()){tsrc[c-'a']++;}
//      for(char c : s.toCharArray()){ssrc[c-'a']++;}
     
//      for(int i = 0 ; i < tsrc.length;i++){
//          if(tsrc[i] != ssrc[i]){
//              return (char)(i+'a');
//          }
//      }
//      return ' ';
     char res = 0;
     for(char c : s.toCharArray()){
         res ^= c;
     }
     for(char c : t.toCharArray()){
         res ^= c;
     }
     return res;
 }

}
