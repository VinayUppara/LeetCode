

public class DecodeAtIndex {
	public String decodeAtIndex(String S, int K) {

		int flag = 0;
		String resultString = "";
		StringBuilder builder = new StringBuilder();

		if(S.length()<2||S.length()>100) {
			return null;
		} else if (Character.isDigit(S.charAt(0))) {
			return null;
		}

		for(int i=0;i<S.length();i++) {
			if(builder.length()>K) {
				break;
			}
			if (Character.isDigit(S.charAt(i))) {
				int digit = Character.getNumericValue(S.charAt(i));
				if(digit==1||digit==0) {
					break;
				}
				while(digit>1) {
					//builder.substring((0),builder.length());
					builder.append(builder.substring(0, flag));
					digit--;
				}
				flag=builder.length();

			} else {
				builder.append(S.charAt(i));
				flag = builder.length();
				
			}
		}

resultString = builder.toString();


		return Character.toString(resultString.charAt(K-1));

	}
	public static void main(String[] args) {
		String S = new String("a23");
		System.out.println(new DecodeAtIndex().decodeAtIndex(S, 6));

	}

}
