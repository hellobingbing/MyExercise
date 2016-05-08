package org.bing.exercises.string;
/**
 * 判断一个字符串是否是由另一个字符串旋转得来的。假定有一个方法isSubstring，可检查一个字符串是否是另一个的子串，并且只能调用一次。
 * @author Acer
 * 解法：str1 = xy,str2 = yx.我们发现无论x和y之间的分割点在哪，yx一定是xyxy的子串，也即str2一定是str1str1的子串。
 */
public class MyStringDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello World!";
		String str2 = "llo World!He";
		System.out.println("Hello World!" + "和" + "llo World!He" + "能相互旋转得来?");
		System.out.println(isRotation(str1,str2));
		
	}

	/**
	 * 思路比较巧妙。
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isRotation(String str1,String str2){
		if(str1.length() == str2.length()){
			/*
			if(isSubstring(str1 + str1, str2)){
				return true;
			}else{
				return false;
			}
			*/
			return isSubstring(str1 + str1, str2);
		}else{
			return false;
		}
	}
	
	/**
	 * 判断一个字符串是否是另一个的substring，此方法只能用一次。
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isSubstring(String str1,String str2){
		if(str1.contains(str2) || str2.contains(str1)){
			return true;
		}else{
			return false;
		}
	}
	
}
