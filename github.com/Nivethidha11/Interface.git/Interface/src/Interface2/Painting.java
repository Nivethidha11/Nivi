package Interface2;

public class Painting 
{
	float value;
	String type;
	Painting(float value,String type)
	{
		this.value = value;
		this.type = type;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	Painting()
	{
		
	}
}
