package day4;

class Student{
	String name;
	int rollno;
	public void attendence(int r, String n){
		name=n;
		rollno=r;
		System.out.println("Printing the Student Details\nName: "+name+", Rollno: "+rollno+"\n");	
	}

}

class Employee{
	String name;
	int EmpId;
	public void empDetails(int e, String n){
		name=n;
		EmpId=e;
		System.out.println("Printing the Employee Details\nName: "+name+", EmpId: "+EmpId+"\n");	
	}

}
class Bank{
	String name;
	long AccountNo;
	public void accountDetails(long a, String n){
		name=n;
		AccountNo=a;
		System.out.println("Printing the Account Details\nName: "+name+", AccountNo: "+AccountNo);	
	}

}

public class StudentEmpBank {

	public static void main(String[] args) {
		Student s=new Student();
		s.attendence(101, "Kizie Basu");
		
		Employee e=new Employee();
		e.empDetails(1052341, "Sumit Kumar");
		
		Bank b = new Bank();
		b.accountDetails(514568374,"Rajkumar Rao" );

	}

}
