package org.bing.exercises.string;
/*
 * 替换空格，将字符串中出现的空格替换为%20
 * 从前向后改成从后向前O(n2)-->O(n)
 */
public class Demo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We are happy.";
		char[] strArr = str.toCharArray();
		String str_new = getNewString(strArr);
		System.out.println(str_new);
		
		
	}
	
	public static String getNewString(char[] strArr){
		int lengthOfOriginal = strArr.length;
		if(lengthOfOriginal <= 0){
			return null;
		}
		int space = 0;
		for(int i = 0;i < strArr.length;i++){
			if(strArr[i] == ' '){
				space++;
			}
		}
		int lengthOfNew = lengthOfOriginal + 2*space;
		char[] strArr_new = new char[lengthOfNew];
		int indexOfOriginal = lengthOfOriginal - 1;
//		int indexOfNew = lengthOfNew - 1;
		while(indexOfOriginal >= 0){
			if(strArr[indexOfOriginal] == ' '){
				strArr_new[--lengthOfNew] = '0';
				strArr_new[--lengthOfNew] = '2';
				strArr_new[--lengthOfNew] = '%';
			}else {
				strArr_new[--lengthOfNew] = strArr[indexOfOriginal];
			}
			indexOfOriginal--;
		}
		return String.valueOf(strArr_new);
		
	}

}
