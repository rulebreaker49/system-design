package LLD.HotelManagementSystem.model;

import LLD.HotelManagementSystem.services.Booking;
import LLD.HotelManagementSystem.services.Search;

import java.util.List;

public class Guest extends Person {
    Booking booking;
    Search searchObj;

    public List<RoomBooking> getAllRoomBookings() {
        return null;
    }
}
