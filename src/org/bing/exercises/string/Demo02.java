package org.bing.exercises.string;
/**
 * 字符串中的数字串求和
 * @author Acer
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A-1B-C--12-2D---2";
		int result = getResult(str);
		System.out.println(result);
		
		
	}
	
//	public static int getResult(String str){
//		boolean sign = true;
//		int cur = 0;
//		int num = 0;
//		int res = 0;
//		if(str == null){
//			return res;
//		}
//		char[] strArr = str.toCharArray();
//		
//		for(int i = 0;i < strArr.length;i++){
//			
//			if(strArr[i] == '-'){
//				sign = !sign;
//				continue;
//			}
//			cur = strArr[i] - '0';
//			if(cur >= 0 && cur <= 9){
//				num = num*10 + (sign?cur:-cur);
//			}else {
//				res = res + num;
//				num = 0;
//				sign = true;
//			}
//			if(i == strArr.length - 1){
//				res = res + num;
//			}
//		}
//		
//		return res;
//		
//	}
	
	public static int getResult(String str){
		if(str == null){
			return 0;
		}
		boolean sign = true;
		int res = 0;
		int num = 0;
		int cur = 0;
		char[] strArr = str.toCharArray();
		
		for(int i = 0;i < strArr.length;i++){
			cur = strArr[i] - '0';
			if(cur < 0 || cur > 9){
				res += num;
				num = 0;
				
				if(strArr[i] == '-'){
					if(i - 1 > -1 && strArr[i - 1] == '-'){
						sign = !sign;
					}else {
						sign = false;
					}
				}
			}else {
				num = num*10 + (sign?cur:-cur);
			}
		}
		res += num;
		return res;
		
	}

}
