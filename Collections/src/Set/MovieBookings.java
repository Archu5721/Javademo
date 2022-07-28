package Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieBookings implements Comparable<MovieBookings> {
	String User;
	String MovieName;
	String Time;
	List<String> tickets;
	
	public MovieBookings(String userName,String MovieName,String MovieTime) {
		this.User=userName;
		this.MovieName=MovieName;
		this.Time=MovieTime;
		this.tickets = new ArrayList<String>();
	}
	void bookTickets(String seatNO) {
		tickets.add(seatNO);
	}
	@Override
	public String toString() {
		return "\nUser: " + this.User + "MovieName: " + this.MovieName + "ShowTime: " + this.Time + "Tickets: " + this.tickets;
	}
//	@Override
//	public int compare(MovieBookings o) {
//		return this.User.compareTo(o.User);
//	}

	@Override
	public int compareTo(MovieBookings o) {
		return this.User.compareTo(o.User);
	}


}
