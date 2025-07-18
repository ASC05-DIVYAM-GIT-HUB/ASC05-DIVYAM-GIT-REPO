package LAB2.MeetingApp;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        MeetingRoom room1 = new MeetingRoom("MR101", 10, 2);
        ZoomMeetingRoom room2 = new ZoomMeetingRoom("MR102", 8, 1, "Z1234", "zoom@company.com");

        Employee emp1 = new Employee("E001");
        Employee emp2 = new Employee("E002");

        BookingManager manager = new BookingManager();

        Booking booking1 = new Booking(emp1, room1, LocalDate.of(2025, 7, 18), LocalTime.of(10, 0), 60);
        Booking booking2 = new Booking(emp2, room2, LocalDate.of(2025, 7, 18), LocalTime.of(11, 0), 30);

        manager.bookRoom(booking1);
        manager.bookRoom(booking2);

        manager.getBookingsByDate(LocalDate.of(2025, 7, 18));
    }
}
