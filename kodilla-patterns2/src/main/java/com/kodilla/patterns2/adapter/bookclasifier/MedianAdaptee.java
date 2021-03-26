package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    private Statistic statistic;

    public MedianAdaptee(){
        this.statistic = new Statistic();
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistic.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistic.medianPublicationYear(books);
    }
}
