package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    public int averagePublicationYear(Map<BookSignature, Book> books);
    public int medianPublicationYear(Map<BookSignature, Book> books);
}