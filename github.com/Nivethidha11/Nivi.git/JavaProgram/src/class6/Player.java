package class6;
public class Player 
{
	String name;
	int pos;
	Player(String name,int pos)
	{
		this.name = name;
		this.pos = pos;
	}
	public String getName() {
		return name;
	}
	public int getPos() {
		return pos;
	}
	void view()
	{
		System.out.print("Player Details -\nclass Player ["+name+"----"+pos+"]");
	}
}
