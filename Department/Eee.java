class Eee extends Department
{
	public Eee(String deptName, int creditFee)
	{
		 super(deptName, creditFee);
	}

	public void calculateSemesterFee(int credit)
	{
		System.out.println(credit*creditFee);
	}
}