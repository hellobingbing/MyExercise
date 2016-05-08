package org.bing.exercises.string;
/**
 * 若M*N矩阵中某个元素为0，则将其所在行与列清零。
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
	 * 不用记录每一个0元素的确切位置。下面的算法需要遍历两次矩阵，这里用两个数组记录所有0元素所在的行与列，第二次遍历时，若元素所在行或者列有0，则赋值0。
	 * @param matrix
	 * @return
	 */
	public static int[][] setZeros(int[][] matrix){
		// 得到矩阵行数
		int rNum = matrix.length;
		// 得到矩阵列数
		int cNum = matrix[0].length;
		boolean[] row = new boolean[rNum];
		boolean[] column = new boolean[cNum];
		// 第一次遍历，记录0元素的行索引与列索引
		for(int i = 0;i < rNum;i++){
			for(int j = 0;j < cNum;j++){
				if(matrix[i][j] == 0){
					// 记录第几行该为0
					row[i] = true;
					// 记录第几列该为0
					column[j] = true;
				}
			}
		}
		// 第二次遍历，若行i或者列j有0，则赋值matrix[i][j]为0。
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
