import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;



public class CreateMaximumArray {
	/*
	 * public int[] maxNumber(int[] nums1, int[] nums2, int k) {
	 * 
	 * int maxArray[] = new int[k];
	 * 
	 * int maxNums1 = findMax(nums1);
	 * 
	 * int maxNums2 = findMax(nums2);
	 * 
	 * ArrayList<Integer> list1 = new ArrayList<Integer>(nums1.length); for(int
	 * i:nums1) list1.add(i);
	 * 
	 * 
	 * ArrayList<Integer> list2 = new ArrayList<Integer>(nums2.length); for(int
	 * i:nums2) list1.add(i);
	 * 
	 * ArrayList<Integer> sumlist1 = new ArrayList<Integer>();
	 * 
	 * ArrayList<Integer> sumlist2 = new ArrayList<Integer>();
	 * 
	 * for(int i = list1.indexOf(maxNums1)+1; i<nums1.length;i++) { int tempSum1 =
	 * maxNums1 + list1.get(i); sumlist1.add(i, tempSum1); }
	 * 
	 * for(int i =list2.indexOf(maxNums2+1); i<nums2.length;i++) { int tempSum2 =
	 * maxNums2 + list2.get(i); sumlist2.add(i, tempSum2); }
	 * 
	 * if(Collections.max(sumlist1)>Collections.max(sumlist2)) {
	 * 
	 * }else {
	 * 
	 * }
	 * 
	 * 
	 * return maxArray; }
	 */

	int findMax(int[] num) {
		Arrays.sort(num);
		return num[num.length-1];
	}

	public int[] maxNumber(int[] nums1, int[] nums2, int k) {
		int n = nums1.length;
		int m = nums2.length;
		int[] ans = new int[k];
		for (int i = Math.max(0, k - m); i <= k && i <= n; ++i) {
			int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
			if (greater(candidate, 0, ans, 0))
				ans = candidate;
		}
		return ans;
	}
	private int[] merge(int[] nums1, int[] nums2, int k) {
		int[] ans = new int[k];
		for (int i = 0, j = 0, r = 0; r < k; ++r)
			ans[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
			return ans;
	}
	public boolean greater(int[] nums1, int i, int[] nums2, int j) {
		while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
			i++;
			j++;
		}
		return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
	}
	public int[] maxArray(int[] nums, int k) {
		int n = nums.length;
		int[] ans = new int[k];
		for (int i = 0, j = 0; i < n; ++i) {
			while (n - i + j > k && j > 0 && ans[j - 1] < nums[i]) j--;
			if (j < k) ans[j++] = nums[i];
		}
		return ans;
	}


	static public void main(String...strings) {
		int nums1[] = {6,4,3,5};
		int nums2[] = {2, 1, 9, 8, 5, 3};
		int result[] = new CreateMaximumArray().maxNumber(nums1, nums2, 6);
		for(int i : result) {
			System.out.println(i);
		}
	}

}
