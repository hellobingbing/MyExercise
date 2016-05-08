package org.bing.exercises.array;
/*
 * 求无序数组中未出现的最小正整数
 */
public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[]{-1,3,2,4};
		int min = getMinPosInt(array);
		System.out.println(min);                               
		
	}
	
//	public static int getMinPosInt(int[] array){
//		int temp = array[0] + 1;
//		for(int i = 1;i < array.length;i++){
//			if(temp <= array[i]){
//				temp = array[i] + 1;
//			}else {
//				continue;
//			}
//		}
//		if(temp <= 0){
//			return 1;
//		}
//		return temp;
//		
//	}
	

}
