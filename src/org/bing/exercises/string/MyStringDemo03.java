package org.bing.exercises.string;

import java.util.Arrays;

/**
 * ���������ַ������ж�����һ���ַ����е��ַ��������к��ܷ�����һ���ַ���
 * @author Acer
 * Ҫ��������ǣ��ַ��Ƿ����ִ�Сд�����пհ׷��Ƿ������ڣ����¼������ִ�Сд�����ҿհ׷������ڡ����⣬�ַ���������ASCII�룬���Թ���256�ַ�
 */
public class MyStringDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello World!";
		String str2 = "!dlroW olleH";
		boolean flag = false;
		flag = rearrange(str1, str2);
		System.out.println("�������ַ���,����һ���ַ����е��ַ���������֮���Ƿ��ܵõ���һ���ַ��� : " + flag);

		
	}

	/**
	 * �����뵽�ķ���������һ��256��С���������飬������������ַ��ĳ��ִ�����ѭ����һ��ѭ����һ�Σ�֮������������Ԫ�ض���0�򷵻�true
	 * @param str1
	 * @param str2
	 * @return �ܷ� ture or false
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
	 * ����е�һ�ַ��������õ���Arrays�����򷽷�
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
