package LLD.HotelManagementSystem.model;

import java.util.List;

public class Hotel {
    private Integer hotelRegId; // Can use UUID
    private String name;
    private Location location;
    private List<Room> roomList;

    public Integer getHotelRegId() {
        return hotelRegId;
    }

    public void setHotelRegId(Integer hotelRegId) {
        this.hotelRegId = hotelRegId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
