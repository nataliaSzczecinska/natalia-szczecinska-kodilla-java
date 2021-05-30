package com.kodilla.patterns.prototype.library;

import static org.junit.jupiter.api.Assertions.*;

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
        assertNotNull(shallowClonedLibrary);
        assertNotNull(deepClonedLibrary);
        assertNotEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(2, deepClonedLibrary.getBooks().size());
        assertEquals(3, shallowClonedLibrary.getBooks().size());
        assertArrayEquals(library.getBooks().toArray(), shallowClonedLibrary.getBooks().toArray());
    }
}

