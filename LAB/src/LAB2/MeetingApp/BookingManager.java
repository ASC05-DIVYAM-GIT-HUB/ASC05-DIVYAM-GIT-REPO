package LAB2.MeetingApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> bookings = new ArrayList<>();

    public void bookRoom(Booking b) {
        bookings.add(b);
        System.out.println("Booking successful!");
    }

    public void getBookingsByDate(LocalDate date) {
        System.out.println("Bookings on " + date + ":");
        for (Booking b : bookings) {
            if (b.meetingDate.equals(date)) {
                b.displayBooking();
            }
        }
    }
}
