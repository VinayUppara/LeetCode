package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class MakeAnagram 
{

	static public void main(String...strings)
	{
		String a = "aabbccddee";
		String b = "abd";
		System.out.println(new MakeAnagram().makeAnagram(a,b));

	}

	public int makeAnagram(String a, String b) {

		HashMap<Character,Integer> countHashMap = new HashMap<Character,Integer>();
		
		for(char c : a.toCharArray()) {
			int count = countHashMap.containsKey(c)?countHashMap.get(c):0;
			countHashMap.put(c, count+1);
		}
		
		for (char c : b.toCharArray()) {
			int count = countHashMap.containsKey(c)?countHashMap.get(c):0;
			countHashMap.put(c, count-1);
		}
		 List<Integer> values = new ArrayList<Integer>(countHashMap.values());
	        int total = 0;
	        for( Integer v: values ) {
	            total += Math.abs(v);
	        }
	        return total;
}
}
