package LAB2.MeetingApp;

public class ZoomMeetingRoom extends MeetingRoom {
    String zoomDeviceId;
    String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public void displayZoomInfo() {
        System.out.println("Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId);
    }
}
