//Thang Dao CISC181010 FEB 22, 2016


import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare all variables (as a reminder)
		double numberOfYears;
		double AnnualReturn;
		double RetiredYears;
		double AnnualRetirement;
		double MonthlySSIncome;
		double RequiredIncome;
		double TotalSaving;
		double SaveMonthly;

		//Scanner for input and DecimalFormat for number arrangement
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//Prompt user
		System.out.println("Want to calculate how much to save per month?");
		
		//Ask for years they plan to work
		System.out.println("How many years do you plan to work:");
		numberOfYears = input.nextInt();

		//Ask for expected annual return
		System.out.println("What is the annual return:");
		AnnualReturn = input.nextDouble();

		//Ask for length of retirement
		System.out.println("What is the retirement duration:");
		RetiredYears = input.nextInt();

		//Ask for the annual retirement
		System.out.println("What is the annual retirement:");
		AnnualRetirement = input.nextDouble();

		//Ask for expected SSI income
		System.out.println("What is your monthly expected social security income:");
		MonthlySSIncome = input.nextInt();
		
		//Ask for required income
		System.out.println("What is the required income:");
		RequiredIncome = input.nextDouble();
		
		//Calculate total saving and format double
		TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirement/100)/12,RetiredYears*12 )))))/((AnnualRetirement/100)/12);
		String x = df.format(TotalSaving + 0);
		
		//Calculate monthly saving and format double
		SaveMonthly = TotalSaving*(((AnnualReturn/100)/12)/((Math.pow(1+(AnnualReturn/100)/12, numberOfYears*12))-1));
		String y = df.format(SaveMonthly);
		
		//Print out useful information
		System.out.println("To have saved $" 
				 + x + " you will need to monthly save $"
				 + y);
		
		
	}

}
