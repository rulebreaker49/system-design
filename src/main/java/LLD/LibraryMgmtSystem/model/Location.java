package LLD.LibraryMgmtSystem.model;

import java.util.Optional;

public class Location {
    String street;
    String area;
    String pincode;
    String city;
    String country;
    Optional<String> latitude;
    Optional<String> longitude;
}
