package org.bing.exercises.string;

/**
 * 判断一个字符串是否含有重复的字符，首先要问字符串是ASCII字符串还是Unicode字符串，这是一个细节。
 * @author Acer
 *
 */
public class MyStringDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World!";
		//Myfun(str);
		fun(str);
		
	}

	/**
	 * 首先想到的方法,时间复杂度较高O(n2)
	 * @param str
	 */
	public static void Myfun(String str){
		char[] temp = str.toCharArray();
		for(int i = 0;i<temp.length;i++){
			for(int j = i + 1;j<temp.length;j++){
				if(temp[i] == temp[j]){
					System.out.println("位置 " + i + " 和 " + j + " 都是 " + temp[i]);
				}
			}
		}
		
	}
	/**
	 * 金典中的方法，用到ASCII字母表中一共就有256个不同字符这个知识点,时间复杂度比较低O(n),空间复杂度O(1)
	 * @param str
	 */
	public static void fun(String str){
		int len = str.length();
		// boolean类型的数组，一开始256个false，认为不重复
		boolean[] temp = new boolean[256];
		if(len > 256){
			System.out.println("此字符串中肯定存在不同的字符");
		}
		for(int i = 0;i<len;i++){
			// 这个字符的数值表示，是唯一的
			int asc = str.charAt(i);
			if(temp[asc]){
				char c = (char)asc;
				System.out.println("重复的字符有:" + c);
			}
			// 此字符出现过，所以对应的boolean改成true
			temp[asc] = true;
		}
		
	}
}
