class Cs extends Department
{
	public Cs(String deptName, int creditFee)
	{
		 super(deptName, creditFee);
	}

	public void calculateSemesterFee(int credit)
	{
		System.out.println(credit*creditFee);
	}
}