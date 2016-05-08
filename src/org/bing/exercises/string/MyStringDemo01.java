package org.bing.exercises.string;

/**
 * �ж�һ���ַ����Ƿ����ظ����ַ�������Ҫ���ַ�����ASCII�ַ�������Unicode�ַ���������һ��ϸ�ڡ�
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
	 * �����뵽�ķ���,ʱ�临�ӶȽϸ�O(n2)
	 * @param str
	 */
	public static void Myfun(String str){
		char[] temp = str.toCharArray();
		for(int i = 0;i<temp.length;i++){
			for(int j = i + 1;j<temp.length;j++){
				if(temp[i] == temp[j]){
					System.out.println("λ�� " + i + " �� " + j + " ���� " + temp[i]);
				}
			}
		}
		
	}
	/**
	 * ����еķ������õ�ASCII��ĸ����һ������256����ͬ�ַ����֪ʶ��,ʱ�临�ӶȱȽϵ�O(n),�ռ临�Ӷ�O(1)
	 * @param str
	 */
	public static void fun(String str){
		int len = str.length();
		// boolean���͵����飬һ��ʼ256��false����Ϊ���ظ�
		boolean[] temp = new boolean[256];
		if(len > 256){
			System.out.println("���ַ����п϶����ڲ�ͬ���ַ�");
		}
		for(int i = 0;i<len;i++){
			// ����ַ�����ֵ��ʾ����Ψһ��
			int asc = str.charAt(i);
			if(temp[asc]){
				char c = (char)asc;
				System.out.println("�ظ����ַ���:" + c);
			}
			// ���ַ����ֹ������Զ�Ӧ��boolean�ĳ�true
			temp[asc] = true;
		}
		
	}
}
