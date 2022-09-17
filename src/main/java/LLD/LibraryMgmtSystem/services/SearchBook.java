package LLD.LibraryMgmtSystem.services;

import LLD.LibraryMgmtSystem.model.BookItem;
import LLD.LibraryMgmtSystem.model.enums.Genre;
import LLD.LibraryMgmtSystem.model.users.Author;

import java.util.Date;
import java.util.List;

public abstract class SearchBook {
    public abstract List<BookItem> getBookByTitle(String title);
    public abstract List<BookItem> getBookByAuthor(Author author);
    public abstract List<BookItem> getBookByType(Genre bookType);
    public abstract List<BookItem> getBookByPublicationDate(Date publicationDate);
}
