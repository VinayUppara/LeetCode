package dailycodingproblem;


public class Square_shortprefix {

	public static void main(String[] args) {

		String[] words = new String[]{"dog","cat","apple","apricot","fish"};

		String[] prefixStrings = findShortestPrefix(words);


		for (String prefix : prefixStrings) {
			System.out.println(prefix);
		}

	}


	public static String[] findShortestPrefix(String[] words) {

	//	int flag = 0;

		String prefixes[] = new String[words.length];
		
		for (int i = 0; i < words.length; i++) {
		prefixes[i] = Character.toString(words[i].charAt(0));
			
		}

		for (int i = 0,j=i+1; i < prefixes.length&&j<prefixes.length; j++,i++) {
			
			if(prefixes[i].equalsIgnoreCase(prefixes[j])) {
				
				int index = 1;
				while(words[i].substring(0, index).equalsIgnoreCase(words[j].substring(0, index))) {
					index++;
					
				}
				prefixes[i] = words[i].substring(0, index);
				prefixes[j] = words[j].substring(0, index);
				
			}
		}
		

		return prefixes;
	}
}
