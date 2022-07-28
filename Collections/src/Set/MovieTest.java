package Set;

import java.util.Set;
import java.util.TreeSet;

public class MovieTest {
	public static void main(String[] args) {
		Set<MovieBookings> moviebookings = new TreeSet<>();
		MovieBookings mb = new MovieBookings("Amala", "Tarzan", "9:00 AM");
		MovieBookings mb1 = new MovieBookings("Aadhi", "Tarzan", "12:00 PM");
		MovieBookings mb2 = new MovieBookings("Kalki", "Tarzan", "15:00 AM");
		MovieBookings mb3 = new MovieBookings("Ram", "Tarzan", "18:00 PM");
		
		mb.bookTickets("F1");
		mb1.bookTickets("F2");
		mb2.bookTickets("F3");
		mb3.bookTickets("F4");
		
		moviebookings.add(mb);
		moviebookings.add(mb1);
		moviebookings.add(mb2);
		moviebookings.add(mb3);
	//	mb1.
		
		System.out.println(moviebookings);
	}
}
