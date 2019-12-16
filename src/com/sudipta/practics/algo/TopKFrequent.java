package com.sudipta.practics.algo;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequent {

	public static void main(String[] args) {
		int nums[] = {1,1, 2,2, 3};
		int k = 2;
		Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i< nums.length; i++){
            int value = map.getOrDefault(nums[i], 0);
            value++;
            map.put(nums[i], value);
        }
        //List<Integer> list = new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key) >= k){
                System.out.println(key);
            }
        }

	}

}
