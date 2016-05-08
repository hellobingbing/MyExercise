package org.bing.exercises.string;
/**
 * ���ַ����еĿո��滻Ϊ%20��Java�Ļ���ʹ���ַ����飬�Ա����
 * @author Acer
 * �����ַ�����������ʱ�������������Ǵ��ַ���β����ʼ�༭���Ӻ���ǰ����������������������ã���Ϊ�ַ���β���ж���Ļ��壬���ص��ĻḲдԭ�����ݡ�
 */
public class MyStringDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ú����֮���������ո�
		String str  = "Hello World! ���   ���!";
		String result = replaceSpaces(str);
		System.out.println(result);
		
	}

	/**
	 * �����뵽�ķ�����ֻɨ��һ���ַ����顣
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
	 * ����еķ�������Ҫɨ�������ַ����顣
	 * @param str
	 * @return
	 */
	public static String replaceSpaces(String str){
		char[] charArray = str.toCharArray();
		int oldLength = charArray.length;
		
		// �ո������
		int spaceCount = 0;
		
		// ��һ��ɨ�裬����ո�����
		for(int i = 0;i < oldLength;i++){
			if(charArray[i] == ' '){
				spaceCount++;
			}
		}
		
		// �޸�ԭ�ȵ��ַ����鳤�ȣ�����Ϊ�滻Ϊ%20��������С�������Ϳ�����ͬһ���ַ������ڴӺ���ǰ�޸��ַ��ˡ�
		int newLength = oldLength + 2 * spaceCount;
		
		// java.lang.ArrayIndexOutOfBoundsException ���������׳��쳣������һ�����ɣ������ǲ��ǾͲ��ܸı��ˡ�
		charArray[newLength] = '\0';
		
		// �ڶ���ɨ�裬�Ӻ���ǰ�޸�����
		for(int i = oldLength - 1;i >= 0;i--){
			if(charArray[i] == ' '){
				charArray[newLength - 1] = '0';
				charArray[newLength - 2] = '2';
				charArray[newLength - 3] = '%';
				// �����newLength���Ӻ���ǰ�޸Ĺ����еĵ�ǰλ��
				newLength = newLength - 3;
			}else{
				charArray[newLength - 1] = charArray[i];
				newLength = newLength - 1;
			}
		}
		return new String(charArray);
		
	}
	
}
