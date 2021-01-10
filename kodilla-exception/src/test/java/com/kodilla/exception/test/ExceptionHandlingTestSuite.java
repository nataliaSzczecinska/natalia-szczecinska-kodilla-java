package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {
    @Test
    public void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 2.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.0, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 2.5))
        );
    }
}
