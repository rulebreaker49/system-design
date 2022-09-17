package LLD.HotelManagementSystem.model;

import java.util.Date;

public class HouseKeepingLogs {
    String description;
    Date startDate;
    Integer duration;
    HouseKeeper houseKeeper;

    public void addLogs(Room room) {
        room.getHouseKeepingLogs().add(this);
    }
}
