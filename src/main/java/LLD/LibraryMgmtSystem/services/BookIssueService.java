package LLD.LibraryMgmtSystem.services;

import LLD.LibraryMgmtSystem.model.BookItem;
import LLD.LibraryMgmtSystem.model.BookReservationDetail;

public abstract class BookIssueService {
    FineService fineService;
    public abstract BookReservationDetail getReservationDetails(BookItem book);
    //reserveBook()
    //issueBook()
    //returnBook()
    //renewBook()
}
