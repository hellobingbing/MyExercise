package org.bing.exercises.string;
/**
 * 利用字符重复出现的次数，实现字符串的压缩功能。比如，字符串aabccccaaa会变为a2b1c4a3.若压缩后的字符串没有变短，则返回原先的字符串。
 * @author Acer
 *
 */
public class MyStringDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "aabccccaaa";
		String str2 = "aabbccdd";
		String str3 = "abcd";
		String result1 = null;
		String result2 = null;
		String result3 = null;
		result1 = compressBetter(str1);
		result2 = compressBetter(str2);
		result3 = compressBetter(str3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
	/**
	 * 首先想到的方法
	 * @param str
	 * @return
	 */
	public static String compress(String str){
		StringBuffer buf = new StringBuffer();
		char[] charArray = str.toCharArray();
		int len = charArray.length;
		
		for(int i = 0;i < len;){
			if(i == len -1){
				buf.append(charArray[i]);
				break;
			}
			// j不断的往后移动,i的位置不变
			int j = i + 1;
			// 要先判断j < len这个条件，注意&&
			while(j < len && charArray[i] == charArray[j]){
				j++;
			}
			buf.append(charArray[i]);
			buf.append(j - i);
			
			// 修改i的指向,也是修改循环变量
			i = j;
		}
		if(str.length() > buf.toString().length()){
			return buf.toString();
		}else{
			return str;
		}
		
	}
	/**
	 * 金典中的方法，思路与我想到的差不多，也用到了StringBuffer。但没有用字符数组，直接用charAt()方法即可得到当前字符。
	 * @param str
	 * @return
	 */
	public static String compressBetter(String str){
		StringBuffer buf = new StringBuffer();
		char current = str.charAt(0);
		int count = 1;
		for(int i = 1;i < str.length();i++){
			if(current == str.charAt(i)){
				count++;
			}else{
				buf.append(current);
				buf.append(count);
				current = str.charAt(i);
				count = 1;
			}
		}
		// 最后一组相同字符的情况，直到超出length，再加一次。
		buf.append(current);
		buf.append(count);
		
		return buf.toString();
	}
	/**
	 * 此方法用来计算压缩后的字符串的长度length。例如：aaaaaaaaaabcd长度为9。判断字符串为空的方法：==null || isEmpty()即equals("")
	 * @param str
	 * @return
	 */
	public static int countCompression(String str){
		if(str == null || str.equals("") || str.isEmpty()){
			return 0;
		}
		int length = 0;
		char current = str.charAt(0);
		int count = 1;
		for(int i = 1;i < str.length();i++){
			if(current == str.charAt(i)){
				count++;
			}else{
				length += 1 + String.valueOf(count).length();
				current = str.charAt(i);
				count = 1;
			}
		}
		length += 1 + String.valueOf(count).length();
		return length;
	}
	
	
}
