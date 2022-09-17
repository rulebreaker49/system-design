package LLD.HotelManagementSystem.model;

import java.util.Date;
import java.util.List;

public class RoomBooking {
    Integer bookingId;
    Date bookingDate;
    int durationDays;
    BookingStatus bookingStatus;
    List<Guest> guestList;
    List<Room> roomList;
    Double roomCharges;
}
