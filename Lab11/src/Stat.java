/*
 * Stat.java
 * Author:  Rishi Kumar 
 * Submission Date:  11/6/2023
 *
 * Purpose: A class defining a few methods
 * that manipulates statistics based on
 * user input of the values and their types
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
public class Stat {
	private double [] data;
	final static double THRESHOLD = 0.000000001;
	/**
	 * Default constructor; creates array of length 0
	 * 
	 * 
	 */
	public Stat() {
		double [] a = new double[0];
		data = a;
	}
	
	/**
	 * Constructor with double array parameter
	 * 
	 * @param double[] d
	 */
	public Stat(double [] d) {
		if (d == null) {
			this.data = new double[0];
			return;
		}
		double[] copyOfD = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			copyOfD[i] = d[i];
		}
		this.data = copyOfD;
	}
	
	/**
	 * Constructor with int array parameter
	 * 
	 * @param int[] i
	 */
	public Stat(int [] i) {
		if (i == null) {
			this.data = new double[0];
			return;
		}
		double[] copyOfI = new double[i.length];
		for (int counter = 0; counter < i.length; counter++) {
			copyOfI[counter] = i[counter];
		}
		this.data = copyOfI;
	}
	
	/**
	 * Constructor with long array parameter
	 * 
	 * @param long[] lo
	 */
	public Stat(long [] lo) {
		if (lo == null) {
			this.data = new double[0];
			return;
		}
		double[] copyOfLo = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			copyOfLo[i] = (double) lo[i];
		}
		this.data = copyOfLo;
	}
	
	/**
	 * Constructor with float array parameter
	 * 
	 * @param float[] f
	 */
	public Stat(float [] f) {
		if (f == null) {
			this.data = new double[0];
			return;
		}
		double[] copyOfF = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			copyOfF[i] = (double) (f[i]);
		}
		this.data = copyOfF;
	}
	
	/**
	 * returns a copy of data 
	 * 
	 * @return copyOfD
	 */
	public double[] getData() {
		double[] copyOfD = new double[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			copyOfD[i] = this.data[i];
		}
		return copyOfD;
	}
	
	/**
	 * Copies data from parameter to private array
	 * 
	 * @param double[] d
	 */
	public void setData(double[] d) {
		if (d == null) {
			double[] emptyArray = new double[0];
			this.data = emptyArray;
			return;
		}
		double[] copyOfD = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			copyOfD[i] = d[i];
		}
		this.data = copyOfD;
	}
	
	/**
	 * Copies data from parameter to private array
	 * 
	 * @param int[] i
	 */
	public void setData(int[] i) {
		if (i == null) {
			double[] emptyArray = new double[0];
			this.data = emptyArray;
			return;
		}
		double[] copyOfI = new double[i.length];
		for (int j = 0; j < i.length; j++) {
			copyOfI[j] = (double) i[j];
		}
		this.data = copyOfI;
	}
	
	/**
	 * Copies data from parameter to private array
	 * 
	 * @param float[] f
	 */
	public void setData(float[] f) {
		if (f == null) {
			double[] emptyArray = new double[0];
			this.data = emptyArray;
			return;
		}
		double[] copyOfF = new double[f.length];
		for (int i = 0; i < f.length; i++) {
			copyOfF[i] = (double) f[i];
		}
		this.data = copyOfF;
	}
	
	/**
	 * Copies data from parameter to private array
	 * 
	 * @param long[] lo
	 */
	public void setData(long[] lo) {
		if (lo == null) {
			double[] emptyArray = new double[0];
			this.data = emptyArray;
			return;
		}
		double[] copyOfLo = new double[lo.length];
		for (int i = 0; i < lo.length; i++) {
			copyOfLo[i] = (double) lo[i];
		}
		this.data = copyOfLo;
	}
	
	/**
	 * Gets the boolean value of whether two arrays are equal
	 * 
	 * @return true/false
	 */
	public boolean equals(Stat s) {
		if(s == null) {
			return false;
		}
		if (this.data.length != s.getData().length) {
			return false;
		}
		for (int i = 0; i < this.data.length; i++) {
			if (!(data[i] - s.getData()[i] < THRESHOLD)) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * toString method (usual)
	 * 
	 * @return a premeditated output
	 */
	public String toString() {
		String result = "";
		result += "[";
		for (int i = 0; i < this.data.length; i++) {
			result += this.data[i];
			if (i != this.data.length - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
	
	/**
	 * Gets the lowest value in the array and returns it
	 * 
	 * @return lowest
	 */
	public double min() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double lowest = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if(this.data[i] <= lowest) {
				lowest = this.data[i];
			}
		}
		return lowest;
	}
	/**
	 * Gets the highest value in the array and returns it
	 * 
	 * @return highest
	 */
	public double max() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double highest = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if(this.data[i] >= highest) {
				highest = this.data[i];
			}
		}
		return highest;
	}
	
	/**
	 * Gets the mean of the array and returns it
	 * 
	 * @return sum/data.length
	 */
	public double average() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double sum = 0.0;
		for (int i = 0; i < this.data.length; i++) {
			sum += this.data[i];
		}
		return sum/this.data.length;
	}
	
	/**
	 * Gets the mode of the data and returns it
	 * 
	 * @return currentMode
	 */
	public double mode() {
		if (this.data.length == 0) {
			return Double.NaN;
		}
		double currentMode = this.data[0];
		int modeCounter = 0;
		for(int i = 0; i < this.data.length; i++) {
			int counter = this.occursNumberOfTimes(this.data[i]);
			if (counter > modeCounter) {
				currentMode = this.data[i];
				modeCounter = counter;
			}
		}
		if (modeCounter == 1) {
			return Double.NaN;
		}
		else {
			return currentMode;
		}
	}
	
	/**
	 * Calculates the variance of the data and returns it
	 * 
	 * @return sum/this.data.length
	 */
	public double variance() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
		double mean = this.average();
		for (int i = 0; i < this.data.length; i++) {
			sum += Math.pow(this.data[i] - mean, 2);
		}
		return sum/this.data.length;
	}
	
	/**
	 * Calculates the standard deviation of the data
	 * given the variance (using the method)
	 * @return Math.sqrt(this.variance())
	 */
	public double standardDeviation() {
		if(this.data.length == 0) {
			return Double.NaN;
		}
		return Math.sqrt(this.variance());
	}
	/**
	 * Helper method for mode method that returns
	 * the count of how many times a value occurs
	 * in data array
	 * 
	 * @return counter
	 * @param value
	 */
	private int occursNumberOfTimes(double value) {
		int counter = 0;
		for(int i = 0; i < this.data.length; i++) {
			if(this.data[i] == value) {
				counter++;
			}
		}
		
		return counter;
	}
	
	/**
	 * Gets the boolean value of whether array is empty
	 * 
	 * @return true/false
	 */
	public boolean isEmpty() {
		if(this.data.length == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * Appends another array to given array
	 * 
	 * @param long[] lo
	 */
	public void append(long[] lo) {
		if(lo == null) {
			return;
		}
		
		double [] resultArray = new double[this.data.length + lo.length];
		for(int i = 0; i < this.data.length; i++) {
			resultArray[i] = this.data[i];
		}
		for(int i = 0; i < lo.length; i++) {
			resultArray[this.data.length + i] = lo[i];
		}
		this.data = resultArray;
	}
	
	/**
	 * Appends another array to given array
	 * 
	 * @param double[] d
	 */
	public void append(double[] d) {
		if(d == null) {
			return;
		}
		double [] resultArray = new double[this.data.length + d.length];
		for(int i = 0; i < this.data.length; i++) {
			resultArray[i] = this.data[i];
		}
		for(int i = 0; i < d.length; i++) {
			resultArray[this.data.length + i] = d[i];
		}
		this.data = resultArray;
	}
	
	/**
	 * Appends another array to given array
	 * 
	 * @param int[] i
	 */
	public void append(int[] i) {
		if(i == null) {
			return;
		}
		double [] resultArray = new double[this.data.length + i.length];
		for(int j = 0; j < this.data.length; j++) {
			resultArray[j] = this.data[j];
		}
		for(int j = 0; j < i.length; j++) {
			resultArray[this.data.length + j] = i[j];
		}
		this.data = resultArray;
	}
	
	/**
	 * Appends another array to given array
	 * 
	 * @param float[] f
	 */
	public void append(float[] f) {
		if(f == null) {
			return;
		}
	
		double [] resultArray = new double[this.data.length + f.length];
		for(int j = 0; j < this.data.length; j++) {
			resultArray[j] = this.data[j];
		}
		for(int j = 0; j < f.length; j++) {
			resultArray[this.data.length + j] = f[j];
		}
		this.data = resultArray;
	}
	/**
	 * Clears contents of array
	 * 
	 * 
	 */
	public void reset() {
		double[] clearedArray = new double[0];
		this.data = clearedArray;
	}
	
}

