
public class Staircase {

	public int climbStairs(int n) {
		 int a = 1, b = 1;
		   for(int i=0;i<n;i++) {
		        a = (b += a) - a;
		   }
		    return a;
		
		// base cases
		/*
		 * if(n <= 0) return 0; if(n == 1) return 1; if(n == 2) return 2;
		 * 
		 * int one_step_before = 1; int two_steps_before = 2; int all_ways = 0;
		 * 
		 * for(int i=2; i<n; i++){ all_ways = one_step_before + two_steps_before;
		 * 
		 * two_steps_before = one_step_before;
		 * 
		 * one_step_before = all_ways; } return all_ways;
		 */
	
	}



	static public void main(String...strings) {
		
		System.out.println(new Staircase().climbStairs(5));
	}

}
