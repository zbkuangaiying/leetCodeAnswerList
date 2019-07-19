package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-7-19 上午10:17:53
 * @ClassName 类名称
 * @Description 类描述
 */
public class BinaryWatch extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
		
	}
	
public static List<String> readBinaryWatch(int num) {
        
	//这个真的是只需要判断 n里面有多少个1了..
	//你看 1 2 4 8   1 2 4 8 16 32  
	//二进制分别是   1 0001 
	// 2 0010 
	// 4 0100
	// 8 1000
	//16 0001 0000
	//32 0010 0000
	//这些数字相加 一定都是不进位的加法  直接^
	// 1+2 = 0011  2+4 = 0110  4+8 = 1100 以此类推
	//1+2+4 = 0111
	//1+2+4+8 = 1111
	//所以 有几个亮着  最终的结果里就有几个1
	//看了题解做的  看了题解之后瞬间恍然大悟... 直接双循环遍历所有可能的时钟数字组合就完事了.
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < 12 ; i ++){
            for(int j = 0 ; j < 60 ; j ++){
                if(Integer.bitCount(i)+Integer.bitCount(j) == num){
                    String str = j<10 ?"0"+j:j+"";
                    list.add(new String(i+":"+str ));
                }
            }
        }
        return list;
    }

}
