public class Course
{
	private String courseName;
	private String courseId;
	private String courseType;
	private Student[] studentList;
	private int max=5;
	private int point;
	
	public Course()
	{
		
	}
	
	public Course(String courseName,String courseId,String courseType,int no)
	{
		this.courseName=courseName;
		this.courseId=courseId;
		this.courseType=courseType;
		if(no<max)
		{
		studentList=new Student[no];
		}
	}
	
	public void addStudent(Student student)
	{
		
			studentList[point]=new Student();
			studentList[point]=student;
			point++;
	}
	
	public void dropStudent(Student student)
	{
		point--;
		for(int i=0;i<studentList.length;i++)
		{
			if(studentList[i].getName()==student.getName())
			{
				studentList[i]=studentList[point];
			}
		}
	}
	
	public String getName()
	{
		return this.courseName;
	}
	
	public void showCourseInfo()
	{
		System.out.println("Course info:" + "\n Name:" +courseName+ "\n Id:" +courseId+ "\n Type:" +courseType);
		//System.out.println("Student info:")
		//for(int i=0;i<studentList.length;i++)
		//{
		//	studentList[i].showInfo();
		//}
	}
}