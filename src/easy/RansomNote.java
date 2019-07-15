package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import android.media.audiofx.Equalizer;

/**
 * @author GK
 * @version 创建时间：2019-7-11 下午4:23:39
 * @ClassName 类名称
 * @Description 类描述
 */
public class RansomNote extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		String ransomNote = "fffbfg";
		String magazine = "effjfggbffjdgbjjhhdegh";
	
		System.out.println(canConstruct(ransomNote, magazine));
	}

	
	 public static boolean canConstruct(String ransomNote, String magazine) {

		 int[] ransomNoteCharArray = new int[26];
		 int[] magazineCharArray = new int[26];
		 
		 for(char c : magazine.toCharArray()) {
			 magazineCharArray[c-'a']++;
		}
		 for(char c : ransomNote.toCharArray()) {
			 ransomNoteCharArray[c-'a']++;
		}
		 
		 for (int i = 0; i <26; i++) {
			if(ransomNoteCharArray[i] >magazineCharArray[i]){
				return false;
			}
		}
		 return true;
	 
//	           int[] src = new int[26];
//	           for (int i = 0; i < magazine.length(); i++) {
//				src[magazine.charAt(i)-'a']++;
//			}
//	           
//	           for (int i = 0; i < ransomNote.length(); i++) {
//				src[ransomNote.charAt(i)-'a']--;
//				if(src[ransomNote.charAt(i)-'a'] < 0){
//					return false;
//				}
//			}
//	           return true;
	
//	           char[] cs1 = ransomNote.toCharArray();
//	           char[] cs2 = magazine.toCharArray();
//	           for (int i = 0; i < cs1.length; i++) {
//	        	   for (int j = 0; j < cs2.length; j++) {
//	   				if(cs1[i] == cs2[j]){
//	   					cs1[i] = ' ';
//	   					cs2[j] = ' ';
//	   				}
//	   			}
//			}
//	           String str1 = new String(cs1).replaceAll(" ", "");
//	           String str2 = new String(cs2).replaceAll(" ", "");
//	         
//	           return str1.length() == 0;
	        
//	      Map<String,Integer> map = new HashMap<>();
//	      for (int i = 0; i < ransomNote.length(); i++) {
//	    	  String str = ransomNote.charAt(i)+"";
//			if(map.containsKey(str)){
//				map.put(str, map.get(str)+1);
//			}else{
//				map.put(str, 0);
//			}
//		}
//	        for (int i = 0; i < magazine.length(); i++) {
//	        	String str = magazine.charAt(i)+"";
//				if(map.containsKey( str)){
//					if(map.get(str) == 0){
//						map.remove(str);
//					}else{
//						map.put(str, map.get(str)-1);
//					}
//				}
//			}
//	        
//	        return map.size() == 0;
	    }
}
