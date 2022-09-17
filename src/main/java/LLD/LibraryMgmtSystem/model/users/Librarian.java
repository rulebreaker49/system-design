package LLD.LibraryMgmtSystem.model.users;

import LLD.LibraryMgmtSystem.model.Book;
import LLD.LibraryMgmtSystem.services.SearchBook;

public abstract class Librarian extends SystemUser {
    public abstract void addBook(Book book);
    public abstract void editBook(Book book);
    public abstract void deleteBook(String bookId);
}
