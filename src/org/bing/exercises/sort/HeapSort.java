package org.bing.exercises.sort;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[]{2,4,5,1,3,7,9,6,8,0};
		System.out.println("排序前的数组:");
		System.out.println(Arrays.toString(array));
		System.out.println("排序后的数组:");
		sort(array);
		
	}
	
	public static void swap(int[] array,int i,int j){
		if(i == j){
			return;
		}
		array[i] = array[i] + array[j];
		array[j] = array[i] - array[j];
		array[i] = array[i] - array[j];
		
	}
	
	public static void createMaxHeap(int[] array,int lastIndex){
		//从后向前调整每一个根节点
		for(int i = (lastIndex - 1)/2;i >= 0;i--){
			int k = i;
			//swap之后，调整下层节点
			while(2*k + 1 <= lastIndex){
				//假设左子节点为较大值的节点
				int biggerIndex = 2*k + 1;
				//如果右子节点存在
				if(biggerIndex < lastIndex){
					if(array[biggerIndex] < array[biggerIndex + 1]){
						biggerIndex++;
					}
				}
				if(array[k] < array[biggerIndex]){
					swap(array, k, biggerIndex);
					k = biggerIndex;
				}else {
					break;
				}
				
			}
		}
	}
	
	public static void sort(int[] array){
		for(int i = array.length - 1;i > 0;i--){
			createMaxHeap(array, i);
			swap(array, 0, i);
			System.out.println(Arrays.toString(array));
		}
	}
	

}
