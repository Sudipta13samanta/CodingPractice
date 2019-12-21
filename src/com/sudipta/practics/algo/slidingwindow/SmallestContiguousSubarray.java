package com.sudipta.practics.algo.slidingwindow;

/**
 * Given an array of positive numbers and a positive number ‘S’, 
 * find the length of the smallest contiguous subarray whose sum is 
 * greater than or equal to ‘S’. Return 0, if no such subarray exists.
 * 
 * Input: [2, 1, 5, 2, 3, 2], S=7 
 * Output: 2
 * Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].
 * 
 * @author Sudipta
 *
 */
public class SmallestContiguousSubarray {

	public static void main(String[] args) {
		int input[] = {2, 1, 5, 2, 3, 2};
		int s =10;
		System.out.print(findMinSubArray(input, s));
	}

	private static int findMinSubArray(int[] input, int s) {
		int count = 0, start = 0, min =Integer.MAX_VALUE;
		for(int i =0; i< input.length; i++) {
			start =i;
			int sum = input[i];
			for(int end=i; end<input.length;end++) {
				sum = sum + input[end];
				if(sum == s && end-start < min) {
					min = end-start+1;
				}
				
			}
		}
		
		return min;
	}

}
