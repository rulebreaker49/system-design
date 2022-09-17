package LLD.HotelManagementSystem.model;

import java.util.Optional;

public class Location {
    private Integer pinCode;
    private String street;
    private String area;
    private String city;
    private String country;
    private Optional<String> longitude;
    private Optional<String> latitude;

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Optional<String> getLongitude() {
        return longitude;
    }

    public void setLongitude(Optional<String> longitude) {
        this.longitude = longitude;
    }

    public Optional<String> getLatitude() {
        return latitude;
    }

    public void setLatitude(Optional<String> latitude) {
        this.latitude = latitude;
    }
}
