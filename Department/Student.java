class Student 
{
   protected String stuName;
   protected Department dept;
   
   public Student()
   {

   }
   
   public Student(String studentName) 
   {  
      this.stuName = studentName;
   }
   
   public Student(String studentName, Department department) 
   {  
      this.stuName = studentName;
	  this.dept = department;
   }

	void showStudentInfo()
	{
		System.out.println("Student Name: " + this.stuName);
		System.out.println("Student Department: " + this.dept.deptName.toUpperCase());
	}
	
	void setDepartment(Department dept)
	{
		this.dept = dept;
	}
	
	void changeDepartment(Department dept)
	{
		this.dept = dept;
	}
	
	void semesterFee(int totalCredit){
		dept.calculateSemesterFee(totalCredit);
	}
}