/*
 * PayoffDebt.java
 * Author:  Rishi Kumar 
 * Submission Date:  8/29/2023
 *
 * Purpose: compute and display the number of months needed to pay
off credit card debt given principal, interest rate, and monthly payment
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

import java.util.Scanner;
import java.text.DecimalFormat;


public class PayoffDebt {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Principal:\t\t\t");
		double principal = scan.nextDouble();
		
		System.out.print("Interest:\t\t\t");
		double annualInterestRate = scan.nextDouble();
		
		System.out.print("Monthly Payment:\t\t");
		double monthlyPayment = scan.nextDouble();
		
		
		double rawMonthsNeededToPayOff = (Math.log(monthlyPayment) - (Math.log(monthlyPayment - (annualInterestRate/1200.0)* principal)))/(Math.log(annualInterestRate/1200.0 + 1.0));
		int monthsNeededToPayOff = (int) Math.ceil(rawMonthsNeededToPayOff);
		
		double totalAmountPaid = monthsNeededToPayOff * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		
		
		
		
		DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");
		
		System.out.println();

		System.out.println("Months Needed to Pay Off:\t" + monthsNeededToPayOff);
		System.out.printf("Total Amount Paid:\t\t%s%n" , currencyFormat.format(totalAmountPaid));
		System.out.printf("Total Interest Paid:\t\t%s%n" , currencyFormat.format(totalInterestPaid));
		
		// Since we are rounding up the raw months to nearest greater whole number, we need to
		// account for over pay by subtracting them and multiplying by monthly payment
		
		/*
		 * Subtract rawMonthsNeededToPayOff from monthsNeededToPayOff. Take the difference and multiply by monthlyPayment
		 */
		String overPayment = currencyFormat.format((monthsNeededToPayOff - rawMonthsNeededToPayOff) * monthlyPayment);
		
		System.out.println("Overpayment:\t\t\t" + overPayment);
		
	}


}
