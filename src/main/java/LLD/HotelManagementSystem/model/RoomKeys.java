package LLD.HotelManagementSystem.model;

import java.util.Date;

public class RoomKeys {
    private Integer keyId;
    private boolean isMasterKey;
    private Date isIssuetAt;
    private boolean isActive;

    public void assignRoom(Room room) {
        room.getRoomKeys().add(this);
    }

    public Integer getKeyId() {
        return keyId;
    }

    public void setKeyId(Integer keyId) {
        this.keyId = keyId;
    }

    public boolean isMasterKey() {
        return isMasterKey;
    }

    public void setMasterKey(boolean masterKey) {
        isMasterKey = masterKey;
    }

    public Date getIsIssuetAt() {
        return isIssuetAt;
    }

    public void setIsIssuetAt(Date isIssuetAt) {
        this.isIssuetAt = isIssuetAt;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
