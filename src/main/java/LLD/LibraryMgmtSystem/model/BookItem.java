package LLD.LibraryMgmtSystem.model;

import LLD.LibraryMgmtSystem.model.enums.BookFormat;
import LLD.LibraryMgmtSystem.model.enums.BookStatus;

import java.util.Date;

public class BookItem extends Book {
    String barcode;
    Date publicationDate;
    Rack rackId;
    BookStatus bookStatus;
    BookFormat bookFormat;
    Date issueDate;

    public void reserveItem(MembershipCard membershipCard) {
        membershipCard.issuedBooks.add(this);
    }
}
