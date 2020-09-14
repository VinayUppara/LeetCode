import java.util.Arrays;

public class SmallerThanCurrent {

	public int[] smallerNumbersThanCurrent(int[] nums) {

		int result[] = new int[nums.length];
		
		Integer temp[]  = Arrays.copyOf(nums, nums.length);

		Arrays.sort(temp);

		result[] = 0;
		for(int i=1;i<nums.length;i++) {
			int j=i+1;
			while(j<nums.length) {
			if(nums[j]-nums[i]>0) {
				result[nums[]]=j; 
			} else {
				result[list.indexOf(temp[j])] = i;
			}
		}
		}

		return nums;

	}

	public static void main(String[] args) {
		int nums[] = {3,4,4,6,1,9};
		new SmallerThanCurrent().smallerNumbersThanCurrent(nums);

	}

}
