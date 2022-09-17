package LLD.HotelManagementSystem.model;

import java.util.List;

public class Room {
    private Integer roomNo;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private Double bookingPrice;
    private List<RoomKeys> roomKeys;
    private List<HouseKeepingLogs> houseKeepingLogs;

    public Integer getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Integer roomNo) {
        this.roomNo = roomNo;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Double getBookingPrice() {
        return bookingPrice;
    }

    public void setBookingPrice(Double bookingPrice) {
        this.bookingPrice = bookingPrice;
    }

    public List<RoomKeys> getRoomKeys() {
        return roomKeys;
    }

    public void setRoomKeys(List<RoomKeys> roomKeys) {
        this.roomKeys = roomKeys;
    }

    public List<HouseKeepingLogs> getHouseKeepingLogs() {
        return houseKeepingLogs;
    }

    public void setHouseKeepingLogs(List<HouseKeepingLogs> houseKeepingLogs) {
        this.houseKeepingLogs = houseKeepingLogs;
    }
}
