
public class TransformArray {

	public static void main(String[] args) {
		int[] nums = {1, 4, 9, 12, 18};
		for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num % 2 == 0) {
                // If num is even, square it
                nums[i] = num * num;
            }
            if (num % 2 != 0) {
                // If num is odd, add 3 to it
                nums[i] += 3;
            }
            if (num % 3 == 0) {
                // If num is a multiple of 3, add 7 to it
                nums[i] += 7;
            }
        }
		for (int num : nums) {
	        System.out.print(num + " ");
	    }
    }
	
}

