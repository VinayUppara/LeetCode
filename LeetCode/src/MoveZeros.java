import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MoveZeros {

	public static void main(String[] args) {
		int nums[] = {1,0,0,0,4,1,4,1};
		int result[] = new MoveZeros().moveZeros(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}

	private int[] moveZeros(int[] nums) {
		
		if(nums.length==1) return nums;
		int index = 0;
		for (int i : nums) {
			if(i!=0) {
				nums[index] = i;
				index++;
			}
		}
			while(index<nums.length) {
				nums[index]=0;
				index++;
			}
		
		return nums;
	}
}
