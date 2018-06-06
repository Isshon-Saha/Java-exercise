public class main
{
	public static void main(String[] args)
	{
		MovablePoint m1=new MovablePoint(1,0,2,2);
		MovableCircle m2=new MovableCircle(0,0,2,2,4);
		m1.moveUp();
		m1.moveDown();
		m1.moveLeft();
		m1.moveLeft();
		m1.toString();
		m2.moveUp();
		m2.moveDown();
		m2.moveLeft();
		m2.moveLeft();
		m2.toString();
	}
}