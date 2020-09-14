import java.util.HashMap;

public class FirstUniqueCharacter {

	public int firstUniqChar(String s) {
		int index = 0; 
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(char c : s.toCharArray()) {
			if(map.get(c)==1) {
				index =  s.indexOf(c);
				break;
			}
		}
		return index;
		
		

	}
	public static void main(String[] args) 
	{
		System.out.println(new FirstUniqueCharacter().firstUniqChar("leetcode"));
	}

}
