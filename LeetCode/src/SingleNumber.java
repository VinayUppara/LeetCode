import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SingleNumber {

	public static void main(String[] args) {
		int nums[] = {2,4,1,4,1};
System.out.println(new SingleNumber().findSingleNumber(nums));

	}

	private int findSingleNumber(int[] nums) {
		List<Integer> set = new ArrayList<Integer>();
		for (int i : nums) {
			if (set.contains(i)) {
				
				set.remove(set.indexOf(i));
			} else {
				set.add(i);
			}
		}
		return set.get(0);
	}

}
