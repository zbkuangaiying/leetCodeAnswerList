package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-9 上午10:29:14
 * @ClassName 类名称
 * @Description 类描述
 */
public class ValidPerfectSquare extends LeetcodeEasyLevel {

	
	public static void main(String[] args) {
		
	}
	
	
	  public boolean isPerfectSquare(int num) {
		  if(num >= 2147483647){
			  return false;
		  }
		  if( num == 0 || num == 1){
			  return true;
		  }
		  
		  int r = num;
	        while(r > num/r){//r是平方根  只要当前的r大于x/平方根 说明r仍然还未接近真正的平方根 
	            r = (r+num/r)/2;// 平方根+x/r的和 等于2平方根 乘以二分之一  就是真正的平方根
	        }
	      if(r*r == num){
	    	  return true;
	      }else{
	    	  return false;
	      }
	        
	}
}
