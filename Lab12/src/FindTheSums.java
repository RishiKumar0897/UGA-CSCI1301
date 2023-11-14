/*
 * FindTheSums.java
 * Author:  Rishi Kumar 
 * Submission Date:  11/14/2023
 *
 * Purpose: Converts a 2D array into a neatly printable
 * format, and contains two methods to find the horizontal
 * and vertical sums (of adjacent numbers) that add up to 
 * the given number sumToFind. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class FindTheSums {
	// to string method that converts given array to
	// neatly printed format.
	public static String arrayToString(int[][] a) {
		String result = "";
		for (int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[row].length; col++) {
				if(!(col == a[row].length - 1)) {
					result += a[row][col] + " ";
				}
				else {
					result += a[row][col];
				}
			}
			if(!(row == a.length - 1)) {
				result += "\n";
			}
		}
		return result;
	}
	//horizontalSums: does calculations for horizontal sums
	// to see if the sequence adds up to suToFind
	public static int[][] horizontalSums(int[][] a, int sumToFind) {
		int[][] resultArray = new int[a.length][a[0].length];
		for(int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				resultArray[row][col] = 0;
			}
		}
		for(int row = 0; row < a.length; row++) {
			int sum = 0;
			int counter = 0;
			for (int col = 0; col < a[row].length; col++) {
				sum = 0;
				counter = 0;
				for (int j = col; j < a[row].length; j++) {
					sum += a[row][j];
					
					if (sum == sumToFind) {
						for(int i = j - counter; i <= j; i++) {
							resultArray[row][i] = a[row][i];
						}
						sum = 0;
						counter = 0;
						
					}
					counter++;
				}
			}	
		}
		return resultArray;
	
	}
	
	//verticalSums: does calculations for columns (vertical)
	// to see if they add up to the target of sumToFind
	public static int[][] verticalSums(int[][] a, int sumToFind) {
		int[][] resultArray = new int[a.length][a[0].length];
		for(int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				resultArray[row][col] = 0;
			}
		}
		for (int col = 0; col < a[0].length; col++) {
			int sum = 0;
			int counter = 0;
			for(int row = 0; row < a.length; row++) {
				sum = 0;
				counter = 0;
				for (int j = row; j < a.length; j++) {
					sum += a[j][col];
					
					if (sum == sumToFind) {
						for(int i = j - counter; i <= j; i++) {
							resultArray[i][col] = a[i][col];
						}
						sum = 0;
						counter = 0;
						
					}
					counter++;
				}
			}
		}
		return resultArray;
	}
}
