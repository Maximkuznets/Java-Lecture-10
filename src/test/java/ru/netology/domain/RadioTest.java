package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();
    //---------- Радио станция --------------

    @ParameterizedTest
    @CsvSource(value = {"Test setup station: 5, 5, 5",
            "Test setup station: 0, 0, 0",
            "Test setup station: 9, 9, 9",
            "Test setup station: 20, 20, 0",
            "Test setup station: -3, -3, 0"})

    public void souldCurrentStation(String testname, int station, int expected) {

        radio.setCurrentStation(station);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Test next station, currentStation: 5', 5, 6",
            "'Test next station, currentStation: 0', 0, 1",
            "'Test next station, currentStation: 9', 9, 0",})

    public void souldNextStation(String testname, int station, int expected) {

        radio.setCurrentStation(station);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Test prev station, currentStation: 5', 5, 4",
            "'Test prev station, currentStation: 0', 0, 9",
            "'Test prev station, currentStation: 9', 9, 8",})

    public void souldPrevStation(String testname, int station, int expected) {

        radio.setCurrentStation(station);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    //----------Конец Радио станция --------------

    //---------- тесты на конструктор выставление количества Станций
    @ParameterizedTest
    @CsvSource(value = {"Test setup station: 5, 5, 5",
            "Test setup station: 0, 0, 0",
            "Test setup station: 14, 14, 14",
            "Test setup station: 15, 15, 0",
            "Test setup station: -3, -3, 0"})

    public void souldCurrentStationNumberStation(String testname, int station, int expected) {
        Radio radio = new Radio(15);

        radio.setCurrentStation(station);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {"'Test next station, currentStation: 5', 5, 6",
            "'Test next station, currentStation: 0', 0, 1",
            "'Test next station, currentStation: 14', 14, 0",})

    public void souldNextStationNumberStation(String testname, int station, int expected) {
        Radio radio = new Radio(15);

        radio.setCurrentStation(station);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Test prev station, currentStation: 5', 5, 4",
            "'Test prev station, currentStation: 0', 0, 14",
            "'Test prev station, currentStation: 14', 14, 13",})

    public void souldPrevStationNumberStation(String testname, int station, int expected) {
        Radio radio = new Radio(15);

        radio.setCurrentStation(station);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
    //----------Конец тесты на конструктор выставление количества Станций



    //---------- Громкость --------------

    @ParameterizedTest
    @CsvSource(value = {"Test setup volume: 5, 5, 5",
            "Test setup volume: 0, 0, 0",
            "Test setup volume: 100, 100, 100",
            "Test setup volume: 200, 200, 0",
            "Test setup volume: -3, -3, 0"})

    public void souldCurrentVolume(String testname, int volume, int expected) {

        radio.setCurrentVolume(volume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Test volume press (+), currentVolume: 5', 5, 6",
            "'Test volume press (+), currentVolume: 0', 0, 1",
            "'Test volume press(+), currentVolume: 100', 100, 100",})

    public void souldNextVolume(String testname, int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.setNextVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"'Test volume press (-), currentVolume: 5', 5, 4",
            "'Test volume press (-), currentVolume: 0', 0, 0",
            "'Test volume press(-), currentVolume: 100', 100, 99",})

    public void souldPrevVolume(String testname, int volume, int expected) {

        radio.setCurrentVolume(volume);
        radio.setPrevVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }



}