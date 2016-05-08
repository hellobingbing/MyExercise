package org.bing.exercises.string;
/**
 * Ìæ»»×Ö·û´®ÖÐÁ¬ÐøµÄ×Ö·û´®
 * @author Acer
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123abcabc456abc789ab0";
		String from = "abc";
		String to = "X";
		
		String result = getString(str, from, to);
		System.out.println(result);
		
	}
	
	public static String getString(String str,String from,String to){
		if(str == null || str.equals("") || from == null || from.equals("")){
			return str;
		}
		char[] strArr = str.toCharArray();
		char[] fromArr = from.toCharArray();
		StringBuffer buf = new StringBuffer();
		for(int i = 0,j = 0;i < strArr.length&&j < fromArr.length;){
			if(strArr[i] == fromArr[j] && j == fromArr.length - 1){
				for(int k = 0;k < fromArr.length;k++){
					strArr[i - k] = '-';
				}
			}else if (strArr[i] == fromArr[j]) {
				i++;
				j++;
				continue;
			}else if (strArr[i] != fromArr[j]) {
				i++;
				continue;
			}else {
				continue;
			}
		}

		for(int i = 0;i < strArr.length;i++){
			if(strArr[i] != '-'){
				buf.append(strArr[i]);
			}
			if((strArr[i] == '-') && (i==0 || strArr[i - 1] != '-')){
				buf.append(to);
			}
		}
		return buf.toString();
		
	}

}
