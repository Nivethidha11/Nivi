package Polymorphism2;

public class Machine 
{
	float energy;
	Machine(float energy)
	{
		this.energy=energy;
	}
	public float getEnergy() {
		return energy;
	}
	Machine()
	{
		
	}
	float addEnergy(int a)
	{
		float add=energy+a;
		return add;
	}
	float addEnergy(float b)
	{
		float add1=energy+b;
		return add1;
	}
	double addEnergy(double c)
	{
		double add2=energy+c;
		return add2;
	}
	int runFan(int k)
	{
		int fin=k-(int)energy;
		return fin;
	}
	float runFan(float k)
	{
		float fin=k-energy;
		return fin;
	}
	double runFan(double k)
	{
		double fin=k-energy;
		return fin;
	}
}
