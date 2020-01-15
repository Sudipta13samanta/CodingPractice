package com.sudipta.practics.algo.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * In a row of trees, the i-th tree produces fruit with type tree[i].
 * You start at any tree of your choice, then repeatedly perform the following steps:
 * 		1. Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
 *      2. Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
 * Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.
 * You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.
 * What is the total amount of fruit you can collect with this procedure?
 * 
 * Input: [1,2,3,2,2]
 * Output: 4
 * Explanation: We can collect [2,3,2,2].
 * If we started at the first tree, we would only collect [1, 2].
 * 
 * @author Sudipta
 *
 */
public class FruitIntoBaskets {

	public static void main(String[] args) {
		int input[] = {3,3,3,1,2,1,1,2,3,3,4};
		System.out.println(totalFruit(input));
	}

	private static int totalFruit(int[] input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max =0;
		for(int i=0; i< input.length; i++) {
			map.clear();
			for(int j=i; j< input.length; j++) {
				map.put(input[j], map.getOrDefault(input[j], 0)+1);
				int count = 0;
				if(map.size() <= 2) {
					for(int val: map.keySet()) {
						count = count + map.get(val);
					}
				}
				
				if(count >= max) {
					max = count;
				}
			}
		}
		return max;
	}

}
