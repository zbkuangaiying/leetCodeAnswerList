package easy;


/**
 * @author GK
 * @version 创建时间：2019-7-29 下午2:15:38
 * @ClassName 类名称
 * @Description 类描述
 */
public class AddStrings extends LeetcodeEasyLevel {
	
	public static void main(String[] args) {
		
		System.out.println(addStrings("1112", "8888"));
	}

    public static String addStrings(String num1, String num2) {
    	
    	StringBuilder sb = new StringBuilder();
    	int lengthA = num1.length()-1;
    	int lengthB = num2.length()-1;
		int res,carry = 0;
		while (lengthA >= 0 && lengthB >= 0) {
			 res = Integer.parseInt(num2.charAt(lengthB)+"")+ Integer.parseInt(num1.charAt(lengthA)+"")+carry;
			 lengthB--;
			 lengthA--;
			
			 if(res >= 10){
				 carry = 1;
			 }else{
				 carry = 0;
			 }
			  res = res%10;
			 sb.append(res);
		}
		while(lengthA >= 0){
			  res = Integer.parseInt(num1.charAt(lengthA-1)+"")+carry;
			 lengthA--;
			 if(res >= 10){
				 carry = 1;
			 }else{
				 carry = 0;
			 }
			 res = res%10;
			 sb.append(res);
		}
		while(lengthB >= 0){
			  res = Integer.parseInt(num2.charAt(lengthB-1)+"")+carry;
			 lengthB--;
		
			 if(res >= 10){
				 carry = 1;
			 }else{
				 carry = 0;
			 }
			 res = (res)%10;
			 sb.append(res);
		}
		
//    	while(true){
//    		if(lengthA <=0 && lengthB <= 0){
//    			break;
//    		}
//    		if(lengthA <= 0){
//    			 a = 0;
//    			 b = Integer.parseInt(num2.charAt(lengthB-1)+"");
//    			 lengthB--;
//    		}else if(lengthB <= 0){
//    			b = 0;
//    			 a = Integer.parseInt(num1.charAt(lengthA-1)+"");
//    			 lengthA--;
//    		}else{
//    			 b = Integer.parseInt(num2.charAt(lengthB-1)+"");
//    			 a = Integer.parseInt(num1.charAt(lengthA-1)+"");
//    			 lengthB--;
//    			 lengthA--;
//    		}
//    		int c = (a+b+carry)%10;
//    		if(a+b+carry >= 10){
//    			carry = 1;
//    		}else{
//    			carry = 0;
//    		}
//    		sb.append(c);
//    	}
    	if(carry == 1){
    		sb.append(carry);
    	}
       return sb.reverse().toString();
    }
}
