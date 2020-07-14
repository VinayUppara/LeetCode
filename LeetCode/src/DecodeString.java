
public class DecodeString {

	/*
	 * public int numDecodings(String s) { if(s.length() == 0) return 0; int pre =
	 * 27, digit, answer = 0, first = 1, second = 1; for(int i = s.length()-1; i >=
	 * 0; i--){ digit = s.charAt(i) - '0'; if(digit == 0) answer = 0; else answer =
	 * first + (digit*10 + pre < 27 ? second : 0); second = first; first = answer;
	 * pre = digit; } return answer;
	 */
	public int numDecodings(String s) {
		
		        if (s == null || s.length() == 0) {
		            return 0;
		        }
		        int n = s.length();
		        int[] dp = new int[n + 1];
		        dp[0] = 1;
		        dp[1] = s.charAt(0) != '0' ? 1 : 0;
		        for (int i = 2; i <= n; i++) {
		            int first = Integer.valueOf(s.substring(i - 1, i));
		            int second = Integer.valueOf(s.substring(i - 2, i));
		            if (first >= 1 && first <= 9) {
		               dp[i] += dp[i-1];  
		            }
		            if (second >= 10 && second <= 26) {
		                dp[i] += dp[i-2];
		            }
		        }
		        return dp[n];
		    } 
		


		static public void main(String...strings) {
			System.out.println(new DecodeString().numDecodings("1234"));
		}

	}
