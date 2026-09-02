class Area 
{
	public static void Circle(double r)
	{
		System.out.println("Area of circle is"+" "+(Math.PI*r*r));
	}
	public void Rectangle(double l,double b)
	{
		System.out.println("Area of retringle is"+" "+(l*b));
	}
	public static void main(String[] args) 
	{
		Circle(2.4);
		Area obj=new Area();
		obj.Rectangle(10,2);
	}
}
