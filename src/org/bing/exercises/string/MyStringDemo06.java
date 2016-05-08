package org.bing.exercises.string;
/**
 * 给定一N*N矩阵表示的图像，其中每个像素的大小4字节。将此图像旋转90度。要将矩阵旋转90度，最简单的做法就是一层一层的进行旋转。
 * @author Acer
 *
 */
public class MyStringDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		System.out.println("旋转之前的矩阵:");
		for(int i = 0;i < matrix.length;i++){
			for(int j = 0;j < matrix[0].length;j++){
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println("旋转90度之后的矩阵:");
		int[][] result = rotate(matrix);
		for(int i = 0;i < result.length;i++){
			for(int j = 0;j < result[0].length;j++){
				System.out.print(result[i][j] + ",");
			}
			System.out.println();
		}
		
	}

	/**
	 * 此算法的时间复杂度为O(n2)，已经是最优解法，因为任何算法都要访问其中的n2个元素。
	 * @param matrix
	 * @return
	 */
	public static int[][] rotate(int[][] matrix){
		// matrix是一个方阵，len为维数
		int len = matrix.length;
		// 逐层的进行旋转
		for(int layer = 0;layer < len/2;layer++){
			// 每一层的开始位置
			int start = layer;
			// 每一层的结束位置
			int end = len - layer - 1;
			// 每一层的四个位置交换元素
			for(int i = start;i < end;i++){
				int offset = i - start;
				// 存储上方元素
				int top = matrix[start][i];
				// 左到上
				matrix[start][i] = matrix[end - offset][start];
				// 下到左
				matrix[end - offset][start] = matrix[end][end - offset];
				// 右到下
				matrix[end][end - offset] = matrix[i][end];
				// 上到右
				matrix[i][end] = top;
			}
		}
		return matrix;
	}
	
	
}
