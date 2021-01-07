
public class ZerosOnes {

	public static void main(String[] args) {
		
		int nums[] = {0,1,0,0,1};
		
		int result1[] = new ZerosOnes().moveZerosLeft(nums);
		 
		for (int i : result1) {
			System.out.println(i);
		}

	}

	private int[] moveZerosLeft(int[] nums) {
		
		int count = 0;
		int index = 0;
		for (int i : nums) {
			if(i!=0) {
				count++;
			}
			else if (i==0) {
				nums[index]=0;
				index++;
			}
		}
		
		while(count!=0&&index<nums.length) {
			nums[index] = 1;
			index++;
			count--;
		}
		
		return nums;
	}

}
