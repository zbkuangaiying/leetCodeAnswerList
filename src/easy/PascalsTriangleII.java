package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-5-5 上午9:38:11
 * @ClassName 类名称
 * @Description 类描述
 * 
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 输入: 3 输出: [1,3,3,1]
 */
public class PascalsTriangleII extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		System.out.println(getRow(5).toString());
		
	}

	
	/**
	 * 直接用杨辉三角通项公式
	 * @param rowIndex
	 * @return
	 */
	  public static List<Integer> getRow(int rowIndex) {
	       	List<Integer> list =new ArrayList<>(rowIndex+1);
	       	long cur = 1;
	       	for (int i = 0; i <= rowIndex; i++) {
				list.add((int) cur);
				cur = cur*(rowIndex-i)/(i+1);
				System.out.println(cur);
			}
	       	return list;
	    }
}
