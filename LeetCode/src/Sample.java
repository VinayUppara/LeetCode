
public class Sample {

	public int[] maxArray(int[] nums, int k) {
		int n = nums.length;
		int[] ans = new int[k];
		for (int i = 0, j = 0; i < n; ++i) {
			while (n - i + j > k && j > 0 && ans[j - 1] < nums[i])
				j--;
			if (j < k) 
				ans[j++] = nums[i];
		}
		return ans;
	}

	static public void main(String...strings) {
		int nums[] = {2,14,1,6,8};
		int res[]=new Sample().maxArray(nums,6);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
