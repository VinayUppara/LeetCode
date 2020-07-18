package dailycodingproblem;

import java.util.Arrays;

public class Problem4 {

	public int leastPositive(int nums[]) {
		int n = nums.length;

		// if the number is NEGTAIVE or greater than n, mark number as (n+1)

		for(int i=0;i<n;i++) {
			if(nums[i]<=0 || nums[i]>n) {
				nums[i] = n+1;
			}
		}
		
		//mark the occurence of an element from 1 to n
		for (int i = 0; i<n; i++) {
			int num = Math.abs(nums[i]);
			if(num>n) {
				continue;
			}
			num--;
			
			if(nums[num]>0) {
				
				nums[num]= -1*nums[num];
			}
			
		}
		
		for (int i = 0; i<n; i++) {
			if(nums[i]>=0) {
				return i+1;
			}
		}
		

		return n + 1;
	}

	static public void main(String...strings) {

		int nums[] = {1,2,0};

		System.out.println(new Problem4().leastPositive(nums));
	}

}
