package org.bing.exercises.string;
/**
 * �ж�һ���ַ����Ƿ�������һ���ַ�����ת�����ġ��ٶ���һ������isSubstring���ɼ��һ���ַ����Ƿ�����һ�����Ӵ�������ֻ�ܵ���һ�Ρ�
 * @author Acer
 * �ⷨ��str1 = xy,str2 = yx.���Ƿ�������x��y֮��ķָ�����ģ�yxһ����xyxy���Ӵ���Ҳ��str2һ����str1str1���Ӵ���
 */
public class MyStringDemo08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Hello World!";
		String str2 = "llo World!He";
		System.out.println("Hello World!" + "��" + "llo World!He" + "���໥��ת����?");
		System.out.println(isRotation(str1,str2));
		
	}

	/**
	 * ˼·�Ƚ����
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isRotation(String str1,String str2){
		if(str1.length() == str2.length()){
			/*
			if(isSubstring(str1 + str1, str2)){
				return true;
			}else{
				return false;
			}
			*/
			return isSubstring(str1 + str1, str2);
		}else{
			return false;
		}
	}
	
	/**
	 * �ж�һ���ַ����Ƿ�����һ����substring���˷���ֻ����һ�Ρ�
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isSubstring(String str1,String str2){
		if(str1.contains(str2) || str2.contains(str1)){
			return true;
		}else{
			return false;
		}
	}
	
}
