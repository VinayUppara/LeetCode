package dailycodingproblem;

public class Google_1 {

	public static void main(String[] args) {

		int nums[] = {3, 4, 9, 6, 1};

		int rightSide[] = findRightCount(nums);
		
		for (int i : rightSide) {
			System.out.println(i);
		}

	}


	static public int[] findRightCount(int[] nums) {

		int rightCount[] = new int[nums.length];

		

		for (int i = 0; i < nums.length; i++) {
			int count=0;

			for(int j=i+1;j<nums.length;j++) {

				if(nums[i]>nums[j]) {
					count++;
				}	

			}
			rightCount[i] = count;

		}
		return rightCount;
	}
}
