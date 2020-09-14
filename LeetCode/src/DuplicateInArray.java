

public class DuplicateInArray {


	static public void main(String...strings) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; 
		System.out.println(new DuplicateInArray().removeDuplicates(nums));
	}

	private int removeDuplicates(int[] nums) {
		if(nums.length==1) return 1;
		int temp = nums[0];
		int count = 1;
		for (int i=1;i<nums.length;i++) {
			if(nums[i]!=temp) {
				temp = nums[i];
				count++;
			}
		}

		return count;
	}

}
