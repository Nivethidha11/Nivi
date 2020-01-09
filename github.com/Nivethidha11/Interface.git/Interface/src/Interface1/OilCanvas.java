package Interface1;

public class OilCanvas extends Canvas implements Ipaint
{
	OilCanvas(String type,int size)
	{
		super(type, size);
	}
	
	public void paint()
	{
		if(type.equals("oil"))
		{
			System.out.println("Paint");
		}
		else
		{
			System.out.println("Cannot Paint.Type mismatch. Oil Paints required for Oil Canvas");
		}
	}

}
