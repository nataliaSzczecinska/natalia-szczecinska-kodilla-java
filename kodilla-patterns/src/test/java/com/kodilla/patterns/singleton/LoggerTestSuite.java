package com.kodilla.patterns.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        Logger loggerInstance = Logger.LOGGER;
        loggerInstance.log("first");
        loggerInstance.log("second");
        //When
        String lastLog = loggerInstance.getLastLog();
        //Then
        assertEquals("second", lastLog);
    }
}

