package Interface1;

public class RegularCanvas extends Canvas implements Ipaint
{
	RegularCanvas(String type,int size)
	{
		super(type, size);
	}
	
	public void paint()
	{
		if(type.equals("water"))
		{
			System.out.println("Paint");
		}
		else
		{
			System.out.println("Cannot Paint.Type mismatch. Water Paints required for Regular Canvas");
		}
	}
}
