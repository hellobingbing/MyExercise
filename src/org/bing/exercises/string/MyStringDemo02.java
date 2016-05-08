package org.bing.exercises.string;
/**
 * ��תһ���ַ���
 * @author Acer
 *
 */
public class MyStringDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello World!";
		String result = null;
		result = reverse(str);
		System.out.println(result);
		
	}
	/**
	 * �����뵽�ķ���
	 * @param str
	 * @return
	 */
	public static String myReverse(String str){
		StringBuffer buf = new StringBuffer();
		char[] charArray = str.toCharArray();
		int len = charArray.length;
		for(int i = len - 1;i >= 0;i--){
			buf.append(charArray[i]);
		}
		return buf.toString();
	}
	/**
	 * �뵽������һ������
	 * @param str
	 * @return
	 */
	public static String myReverse01(String str){
		StringBuffer buf = new StringBuffer();
		int len = str.length();
		for(int i = len - 1;i >= 0;i--){
			buf.append(str.charAt(i));
		}
		
		return buf.toString();
	}
	/**
	 * ��byte���飬ת��ΪASCII��
	 * @param str
	 * @return
	 */
	public static String myReverse02(String str){
		StringBuffer buf = new StringBuffer();
		byte[] temp = str.getBytes();
		int len = temp.length;
		for(int i = len - 1;i >= 0;i--){
			buf.append((char)temp[i]);
		}
		return buf.toString();
	}
	/**
	 * �������¿ռ䣬��ԭ�����ַ�����ֱ�ӷ�ת
	 * @param str
	 * @return
	 */
	public static String reverse(String str){
		StringBuffer buf = new StringBuffer(str);
		int len = buf.length();
		for(int i = 0,j = len - 1;i<j;i++,j--){
			char temp = buf.charAt(i);
			buf.replace(i, i + 1, String.valueOf(buf.charAt(j)));
			buf.replace(j, j + 1, String.valueOf(temp));
		}
		return buf.toString();
		
	}

}
