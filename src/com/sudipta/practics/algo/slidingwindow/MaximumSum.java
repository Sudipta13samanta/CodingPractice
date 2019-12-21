package com.sudipta.practics.algo.slidingwindow;
/**
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
 * Input: [2, 1, 5, 1, 3, 2], k=3 
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 *
 * @author user
 *
 */
public class MaximumSum {

	public static void main(String[] args) {
		int input[] = {2, 3, 4, 1, 5};
		int k = 2;
		System.out.println(maxSum(input, k));

	}

	private static int maxSum(int[] input, int k) {
		int maxSum = 0;
		
		for(int i=0; i<input.length-k; i++) {
			int sum = 0;
			for(int j=i; j<i+k; j++) {
				sum = sum +input[j];
			}
			
			if(maxSum < sum)
				maxSum = sum;
		}
		
		return maxSum;
	}

}
