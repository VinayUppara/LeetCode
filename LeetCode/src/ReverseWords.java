
public class ReverseWords {

	public String reverseWords(String s) {

		String[] modifiedString =  s.trim().replaceAll("  +", " ").split(" ");
		
		if(modifiedString.length==1) {
			return modifiedString[0];
		}
		String resultString = "";
		
		for(int i=modifiedString.length-1;i>=0;i--) {
			resultString+=modifiedString[i]+" ";
		}
		
		return resultString.stripTrailing();
	}

	static public void main(String...strings) {
		String string = "    Leet            code ";
		System.out.println(new ReverseWords().reverseWords(string));
	}
}
