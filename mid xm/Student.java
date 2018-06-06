public class Student
{
	private String name;
	private String id;
	private String department;
	private double cgpa;
	private Course[] courseList;
    private int point;
    private int max=5; 	
	
	public Student()
	{
		
	}
	
	public Student(String a,String b,String c,double cgpa,int no)
	{
		name=a;
		id=b;
		department=c;
		this.cgpa=cgpa;
		if(no<max)
		{
		courseList=new Course[no];
		}
	}
	
	public void addCourse(Student student,Course course)
	{
			courseList[point]=new Course();
			courseList[point]=course;
			courseList[point].addStudent(student);
		    point++;
			
	}
	
	public void dropCourse(Student student,Course course)
	{
		point--;
		for(int i=0;i<courseList.length;i++)
		{
			if(courseList[i].getName()==course.getName())
			{
				courseList[i]=courseList[point];
			}
		}
		course.dropStudent(student);
	}
	
	public void showInfo()
	{
		System.out.println("Student info:" + "\n Name:" +name+ "\n Id:" +id+ "\n Department:" +department+ "\n Cgpa:" +cgpa);
		for(int i=0;i<courseList.length;i++)
		{
			courseList[i].showCourseInfo();
		}
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	
	public void setDepartment(String department)
	{
		this.department=department;
	}
	
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public double getCgpa()
	{
		return this.cgpa;
	}
}