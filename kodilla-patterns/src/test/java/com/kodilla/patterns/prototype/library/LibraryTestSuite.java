package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(2010, 10, 10));
        Library library = new Library("First Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);


        Library shallowClonedLibrary = null;
        Library deepClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(2020, 2, 20));
        library.getBooks().add(book3);

        //Then
        Assert.assertNotNull(shallowClonedLibrary);
        Assert.assertNotNull(deepClonedLibrary);
        Assert.assertNotEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(2,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assert.assertArrayEquals(library.getBooks().toArray(), shallowClonedLibrary.getBooks().toArray());
    }
}

