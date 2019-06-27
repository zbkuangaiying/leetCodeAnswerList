package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;


/**
 * @author GK
 * @version 创建时间：2019-6-27 上午9:17:19
 * @ClassName 类名称
 * @Description 类描述
 */
public class WordPattern extends LeetcodeEasyLevel {

	
	public static void main(String[] args) {
		
	}
	
    public static boolean wordPattern(String pattern, String str) {
        char[] patternArray = pattern.toCharArray();
        String[] strArray = str.split(" ");
        
        if(patternArray.length != strArray.length){
        	return false;
        }
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < strArray.length; i++) {
			if(map.containsKey(patternArray[i]+"") && !map.get(patternArray[i]+"").equals(strArray[i])){
				return false;
			}else{
				map.put(patternArray[i]+"", strArray[i]);
			}
		}
        
        Set<String> patternSet = new HashSet<>(); 
        Set<String> strSet = new HashSet<>(); 
        for (int i = 0; i < strArray.length; i++) {
			patternSet.add(patternArray[i]+"");
			strSet.add(strArray[i]);
		}
        if(patternSet.size() != strSet.size()){
        	return false;
        }
        return true;
        
        
    }
}
