package day4;

public class CalculateSalary {
		private double BasicSal;
		private double Hra;
		private double DA;
		private double incomeTax;
		private double grossSalary;
		
		public void setGrossSalary(double basic, double hra, double da, double it ) {
			BasicSal=basic;
			Hra=hra;
			DA=da;
			incomeTax=it;
			System.out.println("BasicSalary:"+BasicSal+", HRA:"+Hra+", DA:"+da+", Incometax:"+incomeTax+"\n");
		}
		public void getgrossSalary() {
			grossSalary= (BasicSal+Hra+DA)-incomeTax;
			System.out.println("Calculated Gross Salary of the Employee per month: " +grossSalary);
		}

	public static void main(String[] args) {
		CalculateSalary cs = new CalculateSalary();
		cs.setGrossSalary(9599, 8999, 5000, 1000);
		cs.getgrossSalary();

	}

}
