package class6;
import java.util.*;
public class Player 
{
	Scanner q= new Scanner(System.in);
	String name=q.next();
	int pos=q.nextInt();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}

}
