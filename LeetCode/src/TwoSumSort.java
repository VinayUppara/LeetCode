
public class TwoSumSort {
	public int[] twoSum(int[] numbers, int target) {
		//int next = 1;
		int result[] = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for(int j=i+1; j<numbers.length;j++) {
				if(target-numbers[i]==numbers[j]) {
					result[0] = i+1;
					result[1] = j+1;
				}
			}
			
		}

		return result;
	}


	public static void main(String[] args) {
		int[] numbers = {1,2,4,6,9,14,43};
		new TwoSumSort().twoSum(numbers, 13);
	}

}
