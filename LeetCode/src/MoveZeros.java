import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MoveZeros {

	public static void main(String[] args) {
		int nums[] = {1,0,0,0,4,4,1,0};
		//int result[] = new MoveZeros().moveZerosRight(nums);
		int result1[] = new MoveZeros().moveZerosLeft(nums);
		 
		for (int i : result1) {
			System.out.println(i);
		}
	}

	private int[] moveZerosLeft(int[] nums) {
		if(nums.length==1) return nums;
		boolean flag = false;
		int temp = 0;
		int index = 0;
		for (int i=0,j=0;i<nums.length;i++) {
			if(nums[i]==0&&flag) {
				//temp = nums[index];
				nums[j] = 0;
				nums[i] = temp;
				j++;
			} else if (nums[i]!=0) {
				flag = true;
				//index = i;
				temp = nums[i];
			}
		}
		
		return nums;
	}

	private int[] moveZerosRight(int[] nums) {
		
		
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
