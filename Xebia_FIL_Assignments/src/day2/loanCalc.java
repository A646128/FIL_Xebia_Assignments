package day2;

import java.util.Scanner;

public class loanCalc {
       @SuppressWarnings("resource")

       public static void main(String[] args) {
              //(P.r.(1+r)n) / ((1+r)n – 1) -- Formula
       Scanner a = new Scanner(System.in);
       double LoanAmt, rate, time, monthlyEmi;
       System.out.print("Enter Loan Amount: ");
       LoanAmt = a.nextDouble();

       System.out.print("Enter Rate: ");
       rate = a.nextDouble();

       System.out.print("Enter Time in year: ");
       time = a.nextDouble();
       
       rate=rate/(12*100);
       time=time*12;
  
       monthlyEmi= (LoanAmt*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
       System.out.print("Monthly EMI: "+monthlyEmi);
       }
}