package easy;

import java.util.HashMap;

/**
 * @author GK
 * @version 创建时间：2019-8-7 下午2:36:43
 * @ClassName 类名称
 * @Description 类描述
 */
public class NumberofBoomerangs extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
	 public static int numberOfBoomerangs(int[][] points) {
	        HashMap<Integer,Integer> hashmap = new HashMap<>();
	        int count = 0;
	        for(int i = 0 ; i < points.length;i++){
	            hashmap.clear();
	            for(int j = 0; j < points.length;j++){
	                if(i == j){continue;}
	                int distance = (int) (Math.pow((points[i][0]-points[j][0]),2)+Math.pow((points[i][1]-points[j][1]),2));
	                int res = 0;
	                if(hashmap.containsKey(distance)){
	                    res = hashmap.get(distance);
	                }
	                count +=res*2;
	                hashmap.put(distance,res+1);
	            }
	        }
	        return count;
	    }
}
