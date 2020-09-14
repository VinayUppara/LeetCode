package dailycodingproblem;

public class Problem6 {

	public static void main(String[] args) {

		String prefixString = "Vi";
		String[] inputStrings = {"Vinay","Vniay","Vi"};
		String[] resultStrings = new Problem6().matchPrefix(inputStrings,prefixString);
	}

	public String[] matchPrefix(String[] inputStrings, String prefixString) {
		
		String result[] = new String[inputStrings.length];
		int index=0;
		for(String s:inputStrings) {
			if(s.startsWith(prefixString, 0)) {
			result[index++] = s; 	
			}
		}
		
		return result;
	}

}
