public class Main
{
	public static void main(String[] args)
	{
		Student s1=new Student("Isshon","15-29061-1","CSE",3.74,2);
		Student s2=new Student("Rabbi","15-29034-1","CSSE",3.82,2);
		Course c1=new Course("JAVA","1320","CS",1);
		Course c2=new Course("OOP2","1170","CS",1);
		Course c3=new Course("OOP3","1150","CS",1);
		s1.addCourse(s1,c1);
		s1.addCourse(s1,c2);
		s1.showInfo();
		s1.dropCourse(s1,c1);
		s1.addCourse(s1,c3);
		s1.showInfo();
	}
}