package org.bing.exercises.string;
/**
 * �����ַ��ظ����ֵĴ�����ʵ���ַ�����ѹ�����ܡ����磬�ַ���aabccccaaa���Ϊa2b1c4a3.��ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
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
	 * �����뵽�ķ���
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
			// j���ϵ������ƶ�,i��λ�ò���
			int j = i + 1;
			// Ҫ���ж�j < len���������ע��&&
			while(j < len && charArray[i] == charArray[j]){
				j++;
			}
			buf.append(charArray[i]);
			buf.append(j - i);
			
			// �޸�i��ָ��,Ҳ���޸�ѭ������
			i = j;
		}
		if(str.length() > buf.toString().length()){
			return buf.toString();
		}else{
			return str;
		}
		
	}
	/**
	 * ����еķ�����˼·�����뵽�Ĳ�࣬Ҳ�õ���StringBuffer����û�����ַ����飬ֱ����charAt()�������ɵõ���ǰ�ַ���
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
		// ���һ����ͬ�ַ��������ֱ������length���ټ�һ�Ρ�
		buf.append(current);
		buf.append(count);
		
		return buf.toString();
	}
	/**
	 * �˷�����������ѹ������ַ����ĳ���length�����磺aaaaaaaaaabcd����Ϊ9���ж��ַ���Ϊ�յķ�����==null || isEmpty()��equals("")
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
