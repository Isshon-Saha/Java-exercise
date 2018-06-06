public class Student
{
	private String name;
	private int id;
	private String department;
	private double cgpa;

    public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setDepartment(String department)
	{
		this.department=department;
	}
	
	public String getDepartment()
	{
		return this.department;
	}

    public double getCgpa()
	{
		return this.cgpa;
	}	
	
	public int getId()
	{
		return this.id;
	}
    
    public String getName()
	{
		return this.name;
	}

    public Student()
	{
		this.name="empty";
		this.id=0;
		this.department="empty";
		this.cgpa=0;
	}

    public void showInfo()
	{
		System.out.println("Id: " +getId());
        System.out.println("Name: " +getName());
		System.out.println("Department: " +getDepartment());
		System.out.println("Cgpa: " +getCgpa());
	}	
}