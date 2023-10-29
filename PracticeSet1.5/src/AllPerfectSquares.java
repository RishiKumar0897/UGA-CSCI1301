
public class AllPerfectSquares {
	
	

	public static void main(String[] args) {
		
		boolean allPerfectSquares = true;
		
		int[] nums = {1, 5, 7, 9};
		
		for (int num: nums) {
			int sqrt = (int)Math.sqrt(num);
			if (num < 0 || !(sqrt * sqrt == num)) {
				allPerfectSquares = false;
			}
		}
		System.out.print("All perfect squares: " + allPerfectSquares);
	}
		

}
