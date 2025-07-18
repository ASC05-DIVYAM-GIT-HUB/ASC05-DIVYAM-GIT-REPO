package LAB2.MeetingApp;
import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    Employee employee;
    MeetingRoom meetingRoom;
    LocalDate meetingDate;
    LocalTime meetingTime;
    int duration;

    public Booking(Employee employee, MeetingRoom room, LocalDate date, LocalTime time, int duration) {
        this.employee = employee;
        this.meetingRoom = room;
        this.meetingDate = date;
        this.meetingTime = time;
        this.duration = duration;
    }

    public void displayBooking() {
        System.out.println("Employee: " + employee.employeeId +
                ", Room: " + meetingRoom.roomId +
                ", Date: " + meetingDate +
                ", Time: " + meetingTime +
                ", Duration: " + duration + " mins");
    }
}

