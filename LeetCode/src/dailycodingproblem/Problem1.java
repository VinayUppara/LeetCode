package dailycodingproblem;

public class Problem1 {

	public int[] getNumbers(int input[], int sum) {

		int result[] = new int[2];
		int temp = 0;
		for(int i=0;i<input.length;i++) {
			for (int j =i+1;j<input.length;j++) {
				if(sum==input[i]+input[j]) {
					result[0]=input[i];
					result[1]=input[j];
				}else {
					result[i] = 0;
				}
		}
		}
		return result;
	}

	static public void main(String...strings) {
		int input[] = {1,54,3,15,6,18};
		int result[] = new Problem1().getNumbers(input,0);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
