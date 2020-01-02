package class5;

import java.util.Scanner;

public class Lap 
{
	Scanner q=new Scanner(System.in);
	byte no=q.nextByte();
	byte thr=q.nextByte();
	String player=q.next();
	float time=q.nextFloat();
	public byte getNo() {
		return no;
	}
	public void setNo(byte no) {
		this.no = no;
	}
	public byte getThr() {
		return thr;
	}
	public void setThr(byte thr) {
		this.thr = thr;
	}
	public String getPlayer() {
		return player;
	}
	public void setPlayer(String player) {
		this.player = player;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}

}
