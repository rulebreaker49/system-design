package LLD.LibraryMgmtSystem.services;

import LLD.LibraryMgmtSystem.model.BookItem;
import LLD.LibraryMgmtSystem.model.users.SystemUser;

import java.util.Date;

class Fine {
    Date fineDate;
    BookItem book;
    Double fineAmount;
    SystemUser user;
}

public abstract class FineService {
    public abstract Fine calculateFine(BookItem book, SystemUser user, int days);
}
