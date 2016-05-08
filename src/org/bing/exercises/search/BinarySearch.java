package org.bing.exercises.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {6,7,11,12,22,24,26,36};
		int index = search(array, 24);
		System.out.println(index);
		
	}

	/**
	 * ÕÛ°ë²éÕÒ·¨
	 * @param array
	 * @param ele
	 * @return
	 */
	public static int search(int[] array,int ele){
		
		int min = 0;
		int max = array.length - 1;
		
		while(min <= max){
			int mid = (min + max)/2;
			if(ele == array[mid]){
				return mid;
			}else if (ele > array[mid]) {
				min = mid + 1;
			}else {
				max = mid - 1;
			}
		}
		return -1;
		
	}
	
}
