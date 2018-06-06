class Bba extends Department
{
	public Bba(String deptName, int creditFee)
	{
		 super(deptName, creditFee);
	}

	public void calculateSemesterFee(int credit)
	{
		System.out.println(credit*creditFee);
	}
}