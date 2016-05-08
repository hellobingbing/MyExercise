package org.bing.exercises.string;

import java.util.Arrays;

/**
 * 给定两个字符串，判断其中一个字符串中的字符重新排列后能否变成另一个字符串
 * @author Acer
 * 要问清楚的是，字符是否区分大小写，还有空白符是否算在内，以下假设区分大小写，并且空白符算在内。另外，字符集假设是ASCII码，所以共有256字符
 */
public class MyStringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello World!";
		String str2 = "!dlroW olleH";
		boolean flag = false;
		flag = rearrange(str1, str2);
		System.out.println("这两个字符串,其中一个字符串中的字符重新排列之后是否能得到另一个字符串 : " + flag);

		
	}

	/**
	 * 首先想到的方法，定义一个256大小的整型数组，用来存放所有字符的出现次数，循环加一次循环减一次，之后如果数组各个元素都是0则返回true
	 * @param str1
	 * @param str2
	 * @return 能否 ture or false
	 */
	public static boolean rearrange(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2){
			return false;
		}
		int allCharArray[] = new int[256];
		for(int i = 0;i < len1;i++){
			int temp = str1.charAt(i);
			allCharArray[temp]++;
			
		}
		for(int i = 0;i < len2;i++){
			int temp = str2.charAt(i);
			allCharArray[temp]--;
		}
		for(int i = 0;i < allCharArray.length;i++){
			if(allCharArray[i] != 0){
				return false;
			}
		}
		return true;
	}
	/**
	 * 金典中的一种方法，利用到了Arrays的排序方法
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagram(String str1,String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 != len2){
			return false;
		}
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		String result1 = new String(strArray1);
		String result2 = new String(strArray2);
		if(result1.equals(result2)){
			return true;
		}else{
			return false;
		}
	}
}
