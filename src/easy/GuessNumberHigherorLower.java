package easy;
/**
 * @author GK
 * @version 创建时间：2019-7-11 下午3:52:38
 * @ClassName 类名称
 * @Description 类描述
 */
public class GuessNumberHigherorLower extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
	}
	
	public static  int guessNumber(int n) {
        int left = 1;
        int right = n;
        int mid = 0;
        while(left <= right){
           mid = left+(right-left)/2;
           int result = guess(mid);
            if(result == 1){
                left = mid +1;
            }else if(result == -1){
                right = mid-1;
            }else{
                break;
            }
          
        }
        return mid;
    }

	private static int guess(int mid) {
		// TODO Auto-generated method stub
//		return 0;
	}

}
