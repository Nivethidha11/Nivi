package Abstraction4;

public class Booking 
{
	String bookingid,bookingdate;
	float bcashpaid;
	Booking(String bookingid,String bookingdate,float bcashpaid)
	{
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.bcashpaid = bcashpaid;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public float getBcashpaid() {
		return bcashpaid;
	}
	public void setBcashpaid(float bcashpaid) {
		this.bcashpaid = bcashpaid;
	}
	
}
