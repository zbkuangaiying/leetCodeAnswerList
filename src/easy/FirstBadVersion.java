package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-25 下午1:27:22
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 二分查找法分析错误版本...二分法的实际应用
 */
public class FirstBadVersion extends LeetcodeEasyLevel {

	public static void main(String[] args) {
		
	}
	
    public int firstBadVersion(int n) {
    		int low = 1;
    		int high = n;
    		while (low < high) {
				int mid = low+(high-low)/2;
				if(isBadVersion(mid)){
					high = mid;
				}else{
					low = mid + 1;
				}
			}
    		return low;
      }

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
