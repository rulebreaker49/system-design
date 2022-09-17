package LLD.LibraryMgmtSystem.model.users;

import LLD.LibraryMgmtSystem.model.Account;
import LLD.LibraryMgmtSystem.services.BookIssueService;
import LLD.LibraryMgmtSystem.services.SearchBook;

public class SystemUser extends Person {
    String email;
    String phoneNumber;
    String creationDate;

    Account account;
    SearchBook searchBook;
    BookIssueService bookIssueService;
}
