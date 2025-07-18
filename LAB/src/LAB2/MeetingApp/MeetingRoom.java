package LAB2.MeetingApp;

public class MeetingRoom {
    String roomId;
    int capacity;
    int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    public void displayRoomDetails() {
        System.out.println("Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floor);
    }
}

