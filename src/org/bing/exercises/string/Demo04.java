package org.bing.exercises.string;
/*
 * �ж��ַ��������Ƿ����е��ַ���ֻ������һ��
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Helo";
		char[] strArr = str.toCharArray();
		System.out.println(isUnique(strArr));
		
		
	}
	public static boolean isUnique(char[] strArr){
		if(strArr == null){
			return true;
		}
		boolean[] map = new boolean[256];
		for(int i = 0;i < strArr.length;i++){
			if(map[strArr[i]]){
				return false;
			}
			map[strArr[i]] = true;
		}
		return true;
		
	}
	

}
