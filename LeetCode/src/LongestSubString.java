import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class LongestSubString {

	public static void main(String[] args) {
		String inpuString = "vdpd";
		System.out.println(new LongestSubString().lengthOfLongestSubstring(inpuString));


	}

	public int lengthOfLongestSubstring(String s) {

		/*
		 * ArrayList<Character> list = new ArrayList<Character>(); int longestSize = 0;
		 * char c[] = inpuString.toCharArray(); for (char character : c) { if
		 * (list.contains(character)) { if (list.size()>=longestSize) { longestSize =
		 * list.size(); list.clear(); list.add(character); } list.clear();
		 * list.add(character); }else { list.add(character); }
		 * 
		 * }
		 * 
		 * return list.size()>longestSize ? list.size() : longestSize ;
		 */
		
		 int i = 0, index = 0, longestSize = 0;
		    Set<Character> set = new HashSet<>();
		    
		    while (index < s.length()) {
		        if (!set.contains(s.charAt(index))) {
		            set.add(s.charAt(index++));
		            longestSize = Math.max(longestSize, set.size());
		        } else {
		            set.remove(s.charAt(i++));
		        }
		    }
		    
		    return longestSize;
		
	}

}
