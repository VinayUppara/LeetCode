import java.util.HashMap;

public class SubString {
	public int majorityElement(int[] nums) {
		int count = nums.length/2;
		int majority = 0;
		HashMap<Integer,Integer> countTrack = new HashMap<Integer,Integer>();
		if(count==1) {
			return nums[0];
		}
		
		for(int i:nums){
			if(countTrack.containsKey(i)) 
			{
				if(countTrack.get(i)==count)
				{ 
					majority = i;
					break;
				} 
				else
				{
					countTrack.put(i,countTrack.get(i)+1);
				}
			} 
			else 
			{


					countTrack.put(i,1);
			}
		}
			return majority;
		}



		static public void main(String...strings) {
			String string = "abcd";
			int nums[]= {2,2,1,1,1,2,2};
			System.out.println( new SubString().majorityElement(nums));

			//System.out.println(string.substring(3,4));

		}
	}
