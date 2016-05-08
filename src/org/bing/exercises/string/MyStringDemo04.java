package org.bing.exercises.string;
/**
 * 将字符串中的空格替换为%20，Java的话请使用字符数组，以便操作
 * @author Acer
 * 处理字符串操作问题时，常见的做法是从字符串尾部开始编辑，从后往前反向操作，这种做法很有用，因为字符串尾部有额外的缓冲，不必担心会覆写原有数据。
 */
public class MyStringDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 你好和孙冰之间有三个空格
		String str  = "Hello World! 你好   孙冰!";
		String result = replaceSpaces(str);
		System.out.println(result);
		
	}

	/**
	 * 首先想到的方法，只扫描一次字符数组。
	 * @param str
	 * @return
	 */
	public static String replace(String str){
		StringBuffer buf = new StringBuffer();
		char[] charArray = str.toCharArray();
		for(int i = 0;i < charArray.length;i++){
			if(charArray[i] != ' '){
				buf.append(charArray[i]);
			}else{
				buf.append("%20");
			}
		}
		
		return buf.toString();
	}
	/**
	 * 金典中的方法。需要扫描两次字符数组。
	 * @param str
	 * @return
	 */
	public static String replaceSpaces(String str){
		char[] charArray = str.toCharArray();
		int oldLength = charArray.length;
		
		// 空格的数量
		int spaceCount = 0;
		
		// 第一次扫描，求出空格数量
		for(int i = 0;i < oldLength;i++){
			if(charArray[i] == ' '){
				spaceCount++;
			}
		}
		
		// 修改原先的字符数组长度，长度为替换为%20后的数组大小，这样就可以在同一个字符数组内从后往前修改字符了。
		int newLength = oldLength + 2 * spaceCount;
		
		// java.lang.ArrayIndexOutOfBoundsException 下面的语句抛出异常，数组一旦生成，长度是不是就不能改变了。
		charArray[newLength] = '\0';
		
		// 第二次扫描，从后往前修改内容
		for(int i = oldLength - 1;i >= 0;i--){
			if(charArray[i] == ' '){
				charArray[newLength - 1] = '0';
				charArray[newLength - 2] = '2';
				charArray[newLength - 3] = '%';
				// 这里的newLength即从后往前修改过程中的当前位置
				newLength = newLength - 3;
			}else{
				charArray[newLength - 1] = charArray[i];
				newLength = newLength - 1;
			}
		}
		return new String(charArray);
		
	}
	
}
