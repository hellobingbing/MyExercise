package org.bing.exercises.string;

/**
 * ȥ���ַ�������������k��0���Ӵ�
 * @author Acer
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "A0000B000C00";
		int k = 3;
		String result = removeKZeros(str, k);
		System.out.println(result);
		
	}
	
	public static String getSubstring(String str,int k){
		StringBuffer buf = new StringBuffer();
		char[] strArr = str.toCharArray();
		int count = 0;
		for(int i = 0;i < strArr.length;i++){
			if(strArr[i] != '0'){
				buf.append(strArr[i]);
				count = 0;
			}else if (strArr[i] == '0') {
				count++;
			}
			if(count == k && i + 1 < strArr.length && strArr[i + 1] != '0'){
				count = 0;
				continue;
			}else if(count != k && i + 1 < strArr.length && strArr[i + 1] != '0') {
				for(int j = 0;j < count;j++){
					buf.append("0");
				}
			}else if (count != k && i + 1 >= strArr.length) {
				for(int j = 0;j < count;j++){
					buf.append("0");
				}
			}
			
			
		}
		return buf.toString();
		
	}
	/*
	 * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(1)
	 */
	public static String removeKZeros(String str,int k){
		if(str == null || k < 1){
			return str;
		}
		int start = -1;
		int count = 0;
		
		char[] strArr = str.toCharArray();
		for(int i = 0;i < strArr.length;i++){
			if(strArr[i] == '0'){
				start = start == -1?i:start;
				count++;
			}else {
				if(count == k){
					while(count-- > 0)
						strArr[start++] = 0;
				}
				count = 0;
				start = -1;
			}
		}
		if(count == k){
			while(count-- > 0){
				strArr[start++] = 0;
			}
		}
		return String.valueOf(strArr);
		
	}

}
