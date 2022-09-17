package LLD.LibraryMgmtSystem.model;

import LLD.LibraryMgmtSystem.model.enums.Genre;

import java.util.List;

public class Book {
    String bookId;
    String title;
    List<String> authors;
    Genre genre;
    List<BookItem> bookItems;
}
