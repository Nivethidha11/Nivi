package Inheritance3;

public class HotelRoom 
{
	String name;
	int sqclaw,rate;
	boolean wifi,ac;
	HotelRoom(String name,int sqclaw,int rate,boolean wifi,boolean ac)
	{
		this.name = name;
		this.sqclaw = sqclaw;
		this.rate = rate;
		this.wifi = wifi;
		this.ac = ac;
	}
	public String getName() {
		return name;
	}
	
	public int getSqclaw() {
		return sqclaw;
	}
	
	public int getRate() {
		return rate;
	}
	
	public boolean isWifi() {
		return wifi;
	}
	
	public boolean isAc() {
		return ac;
	}
}
