
public class ArrayProduct {


	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];

		for(int i=0,temp=1;i<nums.length;i++) {
			result[i]=temp;
			temp*=nums[i];
		}

		for(int i=nums.length-1,temp=1;i>=0;i--) {
			
			result[i]*=temp;
			temp*=nums[i];
		}



		return result;
	}

	public static void main(String[] args) {

		int nums[]= {1,2,3,4};
		int result[]= new ArrayProduct().productExceptSelf(nums);
		for(int i:result)
			System.out.println(i);
	}

}
