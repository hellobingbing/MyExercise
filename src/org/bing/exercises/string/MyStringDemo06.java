package org.bing.exercises.string;
/**
 * ����һN*N�����ʾ��ͼ������ÿ�����صĴ�С4�ֽڡ�����ͼ����ת90�ȡ�Ҫ��������ת90�ȣ���򵥵���������һ��һ��Ľ�����ת��
 * @author Acer
 *
 */
public class MyStringDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		System.out.println("��ת֮ǰ�ľ���:");
		for(int i = 0;i < matrix.length;i++){
			for(int j = 0;j < matrix[0].length;j++){
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("��ת90��֮��ľ���:");
		int[][] result = rotate(matrix);
		for(int i = 0;i < result.length;i++){
			for(int j = 0;j < result[0].length;j++){
				System.out.print(result[i][j] + ",");
			}
			System.out.println();
		}
		
	}

	/**
	 * ���㷨��ʱ�临�Ӷ�ΪO(n2)���Ѿ������Žⷨ����Ϊ�κ��㷨��Ҫ�������е�n2��Ԫ�ء�
	 * @param matrix
	 * @return
	 */
	public static int[][] rotate(int[][] matrix){
		// matrix��һ������lenΪά��
		int len = matrix.length;
		// ���Ľ�����ת
		for(int layer = 0;layer < len/2;layer++){
			// ÿһ��Ŀ�ʼλ��
			int start = layer;
			// ÿһ��Ľ���λ��
			int end = len - layer - 1;
			// ÿһ����ĸ�λ�ý���Ԫ��
			for(int i = start;i < end;i++){
				int offset = i - start;
				// �洢�Ϸ�Ԫ��
				int top = matrix[start][i];
				// ����
				matrix[start][i] = matrix[end - offset][start];
				// �µ���
				matrix[end - offset][start] = matrix[end][end - offset];
				// �ҵ���
				matrix[end][end - offset] = matrix[i][end];
				// �ϵ���
				matrix[i][end] = top;
			}
		}
		return matrix;
	}
	
	
}
