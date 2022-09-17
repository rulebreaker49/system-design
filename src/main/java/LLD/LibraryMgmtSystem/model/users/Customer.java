package LLD.LibraryMgmtSystem.model.users;

import LLD.LibraryMgmtSystem.model.MembershipCard;
import LLD.LibraryMgmtSystem.services.BookIssueService;
import LLD.LibraryMgmtSystem.services.SearchBook;

public class Customer extends SystemUser {
    MembershipCard membershipCard;
    int totalBooksIssued;
}
