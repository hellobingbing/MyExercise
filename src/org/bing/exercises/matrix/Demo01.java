package org.bing.exercises.matrix;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		boolean result = find(matrix,7);
		System.out.println(result);
		
		
	}
	
	public static boolean find(int[][] matrix,int number){
		int row = matrix.length;
		int col = matrix[0].length;
		if(number < matrix[0][0] || number > matrix[row - 1][col - 1]){
			return false;
		}
		//
		for(int i = 0,j = col - 1;i < row && j >= 0;){
			if(number == matrix[i][j]){
				return true;
			}else if (number < matrix[i][j]) {
				j--;
			}else {
				i++;
			}
		}
		return false;
		
	}

}
