package org.bing.exercises.array;
/*
 * 在一个有序数组中找到相邻的最大差值
 */
public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{1,2,4,9,10};
		int max = getMaxDiff(array);
		System.out.println(max);
		
		
	}
	
	public static int getMaxDiff(int[] array){
		int max = 0;
		for(int i = 0;i < array.length - 1;i++){
			if(array[i + 1] - array[i] > max){
				max = array[i + 1] - array[i];
			}
		}
		return max;
		
	}

}
