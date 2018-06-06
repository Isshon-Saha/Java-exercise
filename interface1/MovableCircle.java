public class MovableCircle extends MovablePoint implements Movable 
{
	private int radious;
	private MovablePoint center;
	
	public MovableCircle(int x,int y,int xSpeed,int ySpeed,int radious)
	{
		super(x,y,xSpeed,ySpeed);
		center=new MovablePoint(x,y,xSpeed,ySpeed);
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
		this.radious=radious;
	}
	
	public String toString()
	{
		String a="success";
		System.out.println("For Circle>>>"+"\n Center:" + "\n X:" +x+ "\n Y:" +y+ "\n Radius:" +radious);
		return a;
	}
	
	public void moveUp()
	{
        center.moveUp();
		y=center.y;
	}
	
	public void moveDown()
	{
		center.moveDown();
		y=center.y;
	}
	
	public void moveLeft()
	{
		center.moveLeft();
		x=center.x;
	}
	
	public void moveRight()
	{
		center.moveRight();
		x=center.x;
	}
}