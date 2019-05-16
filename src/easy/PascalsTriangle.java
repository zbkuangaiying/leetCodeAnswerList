package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GK
 * @version 创建时间：2019-5-2 上午10:26:55
 * @ClassName 类名称
 * @Description 类描述
 */
public class PascalsTriangle extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		System.out.println(generate(5).toString());
	}

	private static List<List<Integer>> generate(int rowNums) {
		List<List<Integer>> list = new ArrayList<>();
		if(rowNums == 0){
			return list;
		}
		List<Integer> first = new ArrayList<>();
		first.add(1);
		list.add(first);
		
		
		for (int i = 1; i < rowNums; i++) {
			List<Integer> a = new ArrayList<>();
			List<Integer> b = list.get(i-1);
			a.add(1);
			for (int j = 1; j < i; j++) {
				a.add(b.get(j-1)+b.get(j));
			}
			a.add(1);
			list.add(a);
		}
		return list;
	}
	
	

}
