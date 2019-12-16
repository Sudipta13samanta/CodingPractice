package com.sudipta.practics.algo;

public class Test {

	public static void main(String []s) {
		System.out.println(chocolateFeast(6,2,2));
	}
	
	static int chocolateFeast(int n, int c, int m) {
        int buy = n/c;
        int wrapper = buy;
        int total = buy;
        while(wrapper >= m){
            int free = wrapper/m;
            int wrapperLeft = wrapper%m + free;
            wrapper = wrapperLeft;
            total = total + buy/m;
        }
        return total;
    }
}
