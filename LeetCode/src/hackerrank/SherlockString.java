package hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class SherlockString {


	static public void main(String...strings)
	{
		String a = "aabbccccdd";
		String result = (new SherlockString().isSherlockString(a));
		System.out.println(result);
	}

	public String isSherlockString(String s) {
		String flag = "false";
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for(char c : s.toCharArray())
		{
			int count = hashMap.containsKey(c)?hashMap.get(c):0;
			hashMap.put(c, count+1);
		}
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();

		for(Integer v:hashMap.values())
		{
			int count1 = frequency.containsKey(v)?frequency.get(v):0;
			frequency.put(v, count1+1);
		}

		if(frequency.size()>2) {
			return flag;
		} else if
		(Collections.max(frequency.keySet())-Collections.min(frequency.keySet())==1&&Collections.min(frequency.values())==1) {
			flag = "true";
		}

		return flag;

	}
}

