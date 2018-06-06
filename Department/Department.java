abstract class Department 
{
   protected String deptName;
   protected int creditFee;
   
   public Department()
   {

   }
   
   public Department(String deptName, int creditFee) 
   {  
      this.deptName = deptName;
	  this.creditFee = creditFee;
   }
   
   public Department(int creditFee) 
   {  
	  this.creditFee = creditFee;
   }

   abstract public void calculateSemesterFee(int credit);
}