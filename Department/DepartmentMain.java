public class DepartmentMain 
{

	public static void main(String[] args) 
	{
		System.out.println("\nStudent Information . . .\n");
		
		Department Cs = new Cs("CS",5000);
		Department Bba = new Bba("BBA",4500);
		Department Eee = new Eee("EEE",4500);
		
		Student st1 = new Student("U");
		Student st2 = new Student("V");
		Student st3 = new Student("W");
		Student st4 = new Student("X");
		Student st5 = new Student("Y");
		Student st6 = new Student("Z");
		
		
		st1.changeDepartment(Cs);
		st1.showStudentInfo();
		st1.semesterFee(15);
		
		st2.changeDepartment(Eee);
		st2.showStudentInfo();
		st2.semesterFee(18);
		
		st3.changeDepartment(Cs);
		st3.showStudentInfo();
		st3.semesterFee(11);
		
		st4.changeDepartment(Bba);
		st4.showStudentInfo();
		st4.semesterFee(18);
		
		st5.changeDepartment(Eee);
		st5.showStudentInfo();
		st5.semesterFee(17);
		
		st6.changeDepartment(Bba);
		st6.showStudentInfo();
		st6.semesterFee(18);
	}
	

}
