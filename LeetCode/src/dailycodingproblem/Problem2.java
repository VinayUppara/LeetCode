package dailycodingproblem;



public class Problem2 {
	public int[] getProductArray(int input[]) {
		int[] result = new int[input.length];
		int productSum=1;

		for(int i=0; i<input.length; i++) {

			int prev = i-1,next =i+1;
			while(prev>=0) {
				productSum = productSum*input[prev];
				prev--;

			}
				while(next<input.length) {
					productSum = productSum*input[next];
					next++;
				}

				result[i] = productSum;
				productSum=1;
		}
		
			return result;
		}

		static public void main(String...strings) {
			int input[] = {1,2,3,2,5,6,7,1};
			int result[] = new Problem2().getProductArray(input);
			for (int i : result) {
				System.out.println(i);
			}
		}


	}
