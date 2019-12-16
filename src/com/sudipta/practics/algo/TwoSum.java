package com.sudipta.practics.algo;
/**
 * https://leetcode.com/problems/two-sum/
 * @author Sudipta
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		twoSum(new int[] {2, 7, 11, 15}, 9);

	}
	
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
   }

}
