package easy;
/**
 * @author GK
 * @version 创建时间：2019-6-20 上午9:15:39
 * @ClassName 类名称
 * @Description 类描述
 */
public class AddDigits extends LeetcodeEasyLevel{
	public static void main(String[] args) {
		System.out.println(addDigits(18));
	}
    public static int addDigits(int num) {
        if(num <= 9){
        	return num;
        }
        while (num > 9) {
			int result = num%9;
			if(result == 0){
				return 9 ;
			}
			num = result;
		}
        return num;
        
       
        
//        int currNum = 0;
//        while (num > 9 ) {
//			int temp = num;
//			while (temp != 0) {
//				currNum += temp%10;
//				temp = temp / 10;
//			}
//			num = currNum;
//			currNum =0;
//		}
//        return num;
    }
}
