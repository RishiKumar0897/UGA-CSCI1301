/*
 * Stat.java
 * Author:  Rishi Kumar 
 * Submission Date:  11/6/2023
 *
 * Purpose: A class defining a few methods
 * that manipulates an array of doubles
 * Update: now includes overloaded methods
 * and other new methods.
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
	
	public Stat() {
		double [] a = {0.0};
		data = a;
	}
	
	public Stat(double [] d) {
		double[] copyOfD = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			copyOfD[i] = d[i];
		}
		this.data = copyOfD;
	}
	
	public double[] getData() {
		double[] copyOfD = new double[this.data.length];
		for (int i = 0; i < this.data.length; i++) {
			copyOfD[i] = this.data[i];
		}
		return copyOfD;
	}
	
	public void setData(double[] d) {
		double[] copyOfD = new double[d.length];
		for (int i = 0; i < d.length; i++) {
			copyOfD[i] = d[i];
		}
		this.data = copyOfD;
	}
	
	public boolean equals(Stat s) {
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
	
	public double min() {
		double lowest = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if(this.data[i] <= lowest) {
				lowest = this.data[i];
			}
		}
		return lowest;
	}
	
	public double max() {
		double highest = this.data[0];
		for (int i = 0; i < this.data.length; i++) {
			if(this.data[i] >= highest) {
				highest = this.data[i];
			}
		}
		return highest;
	}
	
	public double average() {
		double sum = 0.0;
		for (int i = 0; i < this.data.length; i++) {
			sum += this.data[i];
		}
		return sum/this.data.length;
	}
	
	public double mode() {
		int modeCounter = 0;
		double mode = 0.0;
		for (int i = 0; i < this.data.length; i++) {
			double currentValue = data[i];
			int counter = 0;
			for (int j = 0; j < this.data.length; j++) {
				if (i != j) {
					if (data[j] == currentValue) {
						counter++;
					}
				}
			}
			if (counter > modeCounter) {
				mode = currentValue;
				modeCounter = counter;
			}
		}
		if (this.data.length == 1) {
			return data[0];
		}
		else if (modeCounter > 1) {
			return mode;
		}
		else {
			return Double.NaN;
		}
	}
}

