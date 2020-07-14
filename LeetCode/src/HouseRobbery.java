

public class HouseRobbery {




	public static void main(String[] args) {
		int nums[] = {2,7,9,2,3};
		System.out.println(new HouseRobbery().getRobbeyAmount(nums));

	}

	public int getRobbeyAmount(int nums[]) {

		int prev1=0,prev2=0;

		for(int i = 0;i<nums.length;i++) {
			
			int temp = prev1;
			
			prev1 = Math.max(prev1, prev2 + nums[i]);
			
			prev2 = temp;
			
		}


		return prev1;
	}

}
