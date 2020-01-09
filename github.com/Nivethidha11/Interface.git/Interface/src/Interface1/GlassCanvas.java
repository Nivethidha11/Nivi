package Interface1;

public class GlassCanvas extends Canvas implements Ipaint
{
	GlassCanvas(String type,int size)
	{
		super(type, size);
	}
	
	public void paint()
	{
		if(type.equals("glass"))
		{
			System.out.println("Paint");
		}
		else
		{
			System.out.println("Cannot Paint.Type mismatch. Glass Paints required for Glass Canvas");
		}
	}
}
