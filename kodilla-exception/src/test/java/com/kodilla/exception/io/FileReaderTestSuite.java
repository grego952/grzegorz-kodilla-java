package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        //given
        FileReader fileReader = new FileReader();
        //when & then
        assertDoesNotThrow(() ->fileReader.readFile());
    }
    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        //given
        FileReader fileReader = new FileReader();
        String fileName = "nie-ma-takiego-plik.txt";

        //when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName)),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
                );

    }
}
