package org.bing.exercises.sort;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {22,12,11,6,24,7,36,26};
		
		int[] result = bubble(array);
		System.out.println("√∞≈›≈≈–Ú:");
		for(int i : result){
			System.out.print(i + ",");
		}
		System.out.println();
		int[] result1 = select(array);
		System.out.println("—°‘Ò≈≈–Ú:");
		for(int i : result1){
			System.out.print(i + ",");
		}
		System.out.println();
		
	}
	/**
	 * √∞≈›≈≈–Ú
	 * @param array
	 * @return
	 */
	public static int[] bubble(int[] array){
		for(int i = 0;i < array.length - 1;i++){
			int temp;
			for(int j = array.length - 1;j > i;j--){
				if(array[j] < array[j - 1]){
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
	/**
	 * —°‘Ò≈≈–Ú
	 * @param array
	 * @return
	 */
	public static int[] select(int[] array){
		for(int i = 0;i < array.length - 1;i++){
			int min = array[i];
			int index = i;
			for(int j = i + 1;j < array.length;j++){
				if(array[j] < min){
					min = array[j];
					index = j;
				}
			}
			if(index != i){
				array[index] = array[i];
				array[i] = min;
			}
		}
		
		return array;
	}
	
	
}
