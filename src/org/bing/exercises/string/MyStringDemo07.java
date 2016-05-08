package org.bing.exercises.string;
/**
 * ��M*N������ĳ��Ԫ��Ϊ0�������������������㡣
 * @author Acer
 *
 */
public class MyStringDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,0,1,1},{1,1,1,1},{1,1,1,0}};
		int[][] result = null;
		result = setZeros(matrix);
		for(int i = 0;i < result.length;i++){
			for(int j = 0;j < result[0].length;j++){
				System.out.print(result[i][j]);
				System.out.print(",");
			}
			System.out.println();
		}
		
	}
	/**
	 * ���ü�¼ÿһ��0Ԫ�ص�ȷ��λ�á�������㷨��Ҫ�������ξ������������������¼����0Ԫ�����ڵ������У��ڶ��α���ʱ����Ԫ�������л�������0����ֵ0��
	 * @param matrix
	 * @return
	 */
	public static int[][] setZeros(int[][] matrix){
		// �õ���������
		int rNum = matrix.length;
		// �õ���������
		int cNum = matrix[0].length;
		boolean[] row = new boolean[rNum];
		boolean[] column = new boolean[cNum];
		// ��һ�α�������¼0Ԫ�ص���������������
		for(int i = 0;i < rNum;i++){
			for(int j = 0;j < cNum;j++){
				if(matrix[i][j] == 0){
					// ��¼�ڼ��и�Ϊ0
					row[i] = true;
					// ��¼�ڼ��и�Ϊ0
					column[j] = true;
				}
			}
		}
		// �ڶ��α���������i������j��0����ֵmatrix[i][j]Ϊ0��
		for(int i = 0;i < rNum;i++){
			for(int j = 0;j < cNum;j++){
				if(row[i] || column[j]){
					matrix[i][j] = 0;
				}
			}
		}
		
		return matrix;
		
	}

}
