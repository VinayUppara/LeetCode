package dailycodingproblem;

public class Problem5 {

	public int getLargestSum(int[] a) {
		int dp[] = {a[0], a[1]};
		for(int i = 2; i < a.length; i++)
		{
		    int temp = dp[1];
		    dp[1] = dp[0] + a[i]; 
		    dp[0] = Math.max(dp[0], temp);
		}    
	return Math.max(dp[0], dp[1]);
	}

	static public void main(String...strings) {

		int input[] = {2,1,11,0,4,8,5};
		System.out.println(new Problem5().getLargestSum(input));
	}

}
